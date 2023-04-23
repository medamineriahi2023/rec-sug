package com.fseg.management.controllers.abstracts;

import com.fseg.management.services.abstracts.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractCrudController<T> {

    private Class<T> entityClass;

    public AbstractCrudController(Class<T> entityClass) {
        this.entityClass = entityClass;
    }


    @Autowired
    private ICrudService<T> service;


    @GetMapping
    public ResponseEntity<List<T>> getAll(){
        return new ResponseEntity<>(service.getAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<T> save(@RequestBody T dto){
        return new ResponseEntity<>(service.save(dto) , HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> save(@PathVariable Long id){
        service.delete(id);
        return new ResponseEntity<>("Operation deleted successfully" , HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<T> update(@PathVariable T dto){
        return new ResponseEntity<>(service.update(dto) , HttpStatus.OK);
    }

}
