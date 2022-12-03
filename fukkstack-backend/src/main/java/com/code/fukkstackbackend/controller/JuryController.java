package com.code.fukkstackbackend.controller;


import com.code.fukkstackbackend.exception.UserNotFoundException;
import com.code.fukkstackbackend.model.Jury;
import com.code.fukkstackbackend.model.User;
import com.code.fukkstackbackend.repository.JuryRepository;
import com.code.fukkstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class JuryController {
    @Autowired
    private UserRepository userRepository;
    private JuryRepository juryRepository;

    @PutMapping("/jury/{matricule}")
    User updateUser(@RequestBody Jury newJury, @PathVariable String matricule) {
        return userRepository.findById(matricule)
                .map(user -> {
                    user.setNoteJury(newJury.getNoteJury());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(matricule));
    }


}