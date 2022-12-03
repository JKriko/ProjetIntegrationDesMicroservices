package com.code.fukkstackbackend.controller;

import java.util.List;

import com.code.fukkstackbackend.exception.UserNotFoundException;
import com.code.fukkstackbackend.model.User;
import com.code.fukkstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{matricule}")
    User getUserById(@PathVariable String matricule) {
        return userRepository.findById(matricule)
                .orElseThrow(() -> new UserNotFoundException(matricule));
    }

    @PutMapping("/user/{matricule}")
    User updateUser(@RequestBody User newUser, @PathVariable String matricule) {
        return userRepository.findById(matricule)
                .map(user -> {
                    user.setMatricule(newUser.getMatricule());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    user.setNoteJury(newUser.getNoteSupervisor());
                    user.setNoteSupervisor(newUser.getNoteSupervisor());
                    user.setNoteFinale(newUser.getNoteFinale());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(matricule));
    }

    @DeleteMapping("/user/{matricule}")
    String deleteUser(@PathVariable String matricule){
        if(!userRepository.existsById(matricule)){
            throw new UserNotFoundException(matricule);
        }
        userRepository.deleteById(matricule);
        return  "User with id "+matricule+" has been deleted success.";
    }







}