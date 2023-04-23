package com.fseg.management.controllers;

import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.ReactDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reacts")
public class ReactController extends AbstractCrudController<ReactDTO> {

    public ReactController() {
        super(ReactDTO.class);
    }
}
