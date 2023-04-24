package com.fseg.management.controllers;


import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.DepartmentDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comments")
public class CommentController extends AbstractCrudController<CommentDto> {
    public CommentController() {
        super(CommentDto.class);
    }
}
