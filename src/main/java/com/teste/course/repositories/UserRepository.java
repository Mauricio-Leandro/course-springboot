package com.teste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
