package com.example.UserApplication.Controller;

import com.example.UserApplication.Model.User;
import com.example.UserApplication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getUser/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @PutMapping(value = "/update/{userId}/{userName}")
    public String updateUser(@PathVariable String userId ,@PathVariable String userName){
        return userService.updateUserById(userId ,userName);
    }

   @DeleteMapping(value="/delete/{userId}")
   public String deleteUser(@PathVariable String userId ){
       return userService.deleteUserById(userId);
   }
}
