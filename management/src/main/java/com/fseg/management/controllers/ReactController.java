package com.fseg.management.controllers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.dtos.ReactDTO;
import com.fseg.management.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reacts")
public class ReactController {

    @Autowired
    private ICrudService<ReactDTO> service;



    @GetMapping
    public ResponseEntity<List<ReactDTO>> getAll(){
        return new ResponseEntity<>(service.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ReactDTO> save(@RequestBody ReactDTO reactDTO){
        return new ResponseEntity<>(service.save(reactDTO) , HttpStatus.CREATED);
    }
}
