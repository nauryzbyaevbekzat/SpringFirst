package com.nauryzbayev.spring.service;


import com.nauryzbayev.spring.entity.UserEntity;
import com.nauryzbayev.spring.exception.UserAlreadyExistException;
import com.nauryzbayev.spring.exception.UserNotFoundExecption;
import com.nauryzbayev.spring.model.User;
import com.nauryzbayev.spring.repostitory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws  UserAlreadyExistException{
        if(userRepo.findByUsername(user.getUsername()) != null){

            throw   new UserAlreadyExistException("Пользвотель с таким  имением уже существует");
        }
        return userRepo.save(user);
    }
    public User getOne(Long id) throws  UserNotFoundExecption{
        UserEntity userEntity =userRepo.findById(id).get();
        if(userEntity == null){
            throw new UserNotFoundExecption("Пользователь не найден");
        }
        return User.toModel(userEntity);
    }
    public Long delete(Long id){
        userRepo.deleteById(id);
        return id;
    }
}
