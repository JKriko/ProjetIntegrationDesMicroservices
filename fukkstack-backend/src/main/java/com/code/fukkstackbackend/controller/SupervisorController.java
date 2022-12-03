package com.code.fukkstackbackend.controller;


import com.code.fukkstackbackend.exception.UserNotFoundException;
import com.code.fukkstackbackend.model.Jury;
import com.code.fukkstackbackend.model.Supervisor;
import com.code.fukkstackbackend.model.User;
import com.code.fukkstackbackend.repository.JuryRepository;
import com.code.fukkstackbackend.repository.SupervisorRepository;
import com.code.fukkstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class SupervisorController {
    @Autowired
    private UserRepository userRepository;
    private SupervisorRepository supervisorRepository;

    @PutMapping("/supervisor/{matricule}")
    User updateUser(@RequestBody Supervisor newSupervisor, @PathVariable String matricule) {
        return userRepository.findById(matricule)
                .map(user -> {
                    user.setNoteSupervisor(newSupervisor.getNoteSupervisor());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(matricule));
    }


}