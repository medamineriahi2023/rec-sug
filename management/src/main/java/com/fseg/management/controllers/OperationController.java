package com.fseg.management.controllers;

import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.OperationDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/operations")
public class OperationController extends AbstractCrudController<OperationDTO> {

    public OperationController() {
        super(OperationDTO.class);
    }



    //API TODO
    //api react sur operation
    // dislike operation
    //comment operation
    //update comment operation
    //delete comment operation


}
