package com.uep.wap.controller;

import com.uep.wap.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private final UserService userService;
    private Object pin;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("Użytkownik zarejestrowany pomyślnie.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Błąd rejestracji użytkownika: " + e.getMessage());
            @PostMapping("/login") ResponseEntity<String> login; (String);

        }
                boolean isAuthenticated = userService.login(email, pin);
                if (isAuthenticated) {
                    return ResponseEntity.ok("Użytkownik zalogowany pomyślnie.");
                } else {
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Błąd logowania: Nieprawidłowe dane logowania.");
                }
            }


        }
    }
}