package com.fseg.management.controllers;


import com.fseg.management.dtos.DepartmentDto;
import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.services.DepartmentService;
import com.fseg.management.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAll(){
        return new ResponseEntity<>(departmentService.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.save(departmentDto) , HttpStatus.CREATED);
    }
}
