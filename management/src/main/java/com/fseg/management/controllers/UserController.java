package com.fseg.management.controllers;


import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.CommentDto;
import com.fseg.management.services.UserService;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin(value = "*")
public class UserController  {
    @Autowired
    UserService userService;

    @GetMapping(path = "/{userId}")
    public String getUsernameById(@PathVariable String userId){
        return userService.getUserNameById(userId);
    }

    @GetMapping
    public List<UserRepresentation> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/roles")
    public List<RoleRepresentation> getAllRoles(){
        return userService.getAllRoles();
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserRepresentation userRepresentation){
        return userService.createUser(userRepresentation);
    }


    @PostMapping(path = "/changePass/{userId}/{newPass}")
    public ResponseEntity<?> updatePassword(@PathVariable String userId ,@PathVariable String newPass){
        return userService.changePass(userId, newPass);
    }



}
