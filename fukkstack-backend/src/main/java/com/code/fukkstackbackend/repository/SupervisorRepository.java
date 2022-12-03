package com.code.fukkstackbackend.repository;

import com.code.fukkstackbackend.model.Supervisor;
import com.code.fukkstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupervisorRepository extends JpaRepository<Supervisor,String>{
}
