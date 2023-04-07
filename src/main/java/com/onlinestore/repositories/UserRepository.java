package com.onlinestore.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinestore.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
