package com.jpa.audit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.audit.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{

	User findByUserName(String email);

}