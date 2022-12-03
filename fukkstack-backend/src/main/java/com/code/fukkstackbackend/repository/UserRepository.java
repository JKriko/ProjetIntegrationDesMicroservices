package com.code.fukkstackbackend.repository;

import com.code.fukkstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
