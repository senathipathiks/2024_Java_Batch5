package com.boot.Ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.boot.Ex.model.User;
import com.boot.Ex.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
	
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // This should be the name of your JSP view
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }
    
    @PostMapping
    public User addStudent(@RequestBody User user) {
        return userService.addStudent(user);
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute User user) {
        userService.saveUser(user); // saveUser method is used for both saving and updating
        return "redirect:/users";
    }

    @PostMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}

