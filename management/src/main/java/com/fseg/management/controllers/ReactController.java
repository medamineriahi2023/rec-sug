package com.fseg.management.controllers;

import com.fseg.management.dtos.ReactDTO;
import com.fseg.management.services.ReactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reacts")
public class ReactController {

    @Autowired
    private ReactService reactService;



    @GetMapping
    public ResponseEntity<List<ReactDTO>> getAll(){
        return new ResponseEntity<>(reactService.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ReactDTO> save(@RequestBody ReactDTO reactDTO){
        return new ResponseEntity<>(reactService.save(reactDTO) , HttpStatus.CREATED);
    }
}
