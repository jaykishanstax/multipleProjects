package com.java.store.admin.controller;

import com.java.store.admin.entity.User;
import com.java.store.admin.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "User Rest Controller", description = "REST API for User")
public class UserController {

    @Autowired
    private UserService userService;

    // insert user
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User userdata = userService.addUser(user);
        return new ResponseEntity<>(userdata, HttpStatus.CREATED);
    }

    // get single user
    @GetMapping("/user")
    public ResponseEntity<User> getUser(@RequestParam(name = "id") long id){
        User userData = userService.getUser(id);
        return new ResponseEntity<>(userData, HttpStatus.OK);
    }


    // get all user details
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // update existing user details
    @PatchMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestParam(name = "id") long id, @RequestBody User user){
        User userData = userService.updateUser(id, user);
        return new ResponseEntity<>(userData, HttpStatus.OK);
    }

    // delete exisiting user details
    @DeleteMapping("/deleteUser")
    public ResponseEntity<User> deleteUser(@RequestParam(name = "id") long id){
        User userData = userService.deleteUser(id);
        return new ResponseEntity<>(userData, HttpStatus.OK);
    }

    // get user details  by name
    @GetMapping("/getUserDataByName")
    public ResponseEntity<User> getUserDataByName(@RequestParam(name = "firstname") String name){
        User userData = userService.getUserByName(name);
        return new ResponseEntity<>(userData, HttpStatus.OK);
    }
}
