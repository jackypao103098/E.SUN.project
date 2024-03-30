package com.springboot.blog.repository;

import com.springboot.blog.entity.Employee;
import com.springboot.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findOneByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}
