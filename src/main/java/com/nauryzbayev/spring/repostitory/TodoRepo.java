package com.nauryzbayev.spring.repostitory;


import com.nauryzbayev.spring.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}