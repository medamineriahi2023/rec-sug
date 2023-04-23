package com.fseg.management.controllers;


import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.DepartmentDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController extends AbstractCrudController<DepartmentDto> {
    public DepartmentController() {
        super(DepartmentDto.class);
    }
}
