package com.fseg.management.controllers;


import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.CommentDto;
import com.fseg.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}
