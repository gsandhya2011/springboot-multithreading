package com.sandhya.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandhya.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
