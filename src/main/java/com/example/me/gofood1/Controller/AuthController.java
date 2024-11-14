package com.example.me.gofood1.Controller;

import com.example.me.gofood1.Entity.User;
import com.example.me.gofood1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private UserService userService;

//    @GetMapping("/login")
//    public String showLoginForm() {
//        return "login";
//    }
//
//    @GetMapping("/signup")
//    public String showSignupForm() {
//        return "signup";
//    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Username is already in use");
        }
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()) != null) {

            return ResponseEntity.ok().body("Login successful");
        }
        return ResponseEntity.badRequest().body("Invalid username or password");
    }
}
