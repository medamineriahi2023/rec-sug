package com.fseg.management.controllers;

import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.ImageDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/images")
public class ImageController extends AbstractCrudController<ImageDTO> {



    public ImageController() {
        super(ImageDTO.class);
    }
}
