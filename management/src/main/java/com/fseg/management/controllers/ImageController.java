package com.fseg.management.controllers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/images")
public class ImageController {

    @Autowired
    private ICrudService<ImageDTO> service;



    @GetMapping
    public ResponseEntity<List<ImageDTO>> getAll(){
        return new ResponseEntity<>(service.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ImageDTO> save(@RequestBody ImageDTO imageDTO){
        return new ResponseEntity<>(service.save(imageDTO) , HttpStatus.CREATED);
    }
}
