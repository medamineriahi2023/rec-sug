package com.fseg.management.controllers;

import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/operations")
public class OperationController {

    @Autowired
    private OperationService operationService;



    @GetMapping
    public ResponseEntity<List<OperationDTO>> getAll(){
        return new ResponseEntity<>(operationService.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<OperationDTO> save(@RequestBody OperationDTO operationDTO){
        return new ResponseEntity<>(operationService.save(operationDTO) , HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> save(@PathVariable Long id){
        operationService.delete(id);
        return new ResponseEntity<>("Operation deleted successfully" , HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<OperationDTO> update(@PathVariable OperationDTO operationDTO){
        return new ResponseEntity<>(operationService.update(operationDTO) , HttpStatus.NO_CONTENT);
    }
    //API TODO
    //api react sur operation
    // dislike operation
    //comment operation
    //update comment operation
    //delete comment operation


}
