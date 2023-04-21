package com.fseg.management.controllers;

import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.dtos.ReactDTO;
import com.fseg.management.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/operations")
public class OperationController {

    @Autowired
    private ICrudService<OperationDTO> service;



    @GetMapping
    public ResponseEntity<List<OperationDTO>> getAll(){
        return new ResponseEntity<>(service.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<OperationDTO> save(@RequestBody OperationDTO operationDTO){
        return new ResponseEntity<>(service.save(operationDTO) , HttpStatus.CREATED);
    }
}