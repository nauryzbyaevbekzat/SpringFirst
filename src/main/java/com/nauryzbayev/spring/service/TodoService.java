package com.nauryzbayev.spring.service;


import com.nauryzbayev.spring.entity.TodoEntity;
import com.nauryzbayev.spring.entity.UserEntity;
import com.nauryzbayev.spring.model.Todo;
import com.nauryzbayev.spring.repostitory.TodoRepo;
import com.nauryzbayev.spring.repostitory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}