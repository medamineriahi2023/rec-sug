package com.fseg.management.controllers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/images")
public class ImageController {

    @Autowired
    private ImageService imageService;



    @GetMapping
    public ResponseEntity<List<ImageDTO>> getAll(){
        return new ResponseEntity<>(imageService.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ImageDTO> save(@RequestBody ImageDTO imageDTO){
        return new ResponseEntity<>(imageService.save(imageDTO) , HttpStatus.CREATED);
    }
}
