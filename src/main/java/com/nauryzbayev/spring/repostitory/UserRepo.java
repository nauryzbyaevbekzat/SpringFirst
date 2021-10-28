package com.nauryzbayev.spring.repostitory;

import com.nauryzbayev.spring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity , Long> {

    UserEntity findByUsername(String username);

}
