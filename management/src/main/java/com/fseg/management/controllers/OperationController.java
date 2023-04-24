package com.fseg.management.controllers;

import com.fseg.management.controllers.abstracts.AbstractCrudController;
import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/operations")
public class OperationController extends AbstractCrudController<OperationDTO> {

    @Autowired
    private OperationService operationService;

    public OperationController() {
        super(OperationDTO.class);
    }

    @PutMapping("like/{operationId}/{userId}")
    public OperationDTO likeAnOperation(@PathVariable(name = "operationId") Long operationId , @PathVariable String userId) {
           return operationService.likeAnOperation(operationId,userId);
    }

    @PutMapping("dislike/{operationId}/{userId}")
    public OperationDTO dislikeAnOperation(@PathVariable(name = "operationId") Long operationId , @PathVariable String userId) {
        return operationService.dislikeAnOperation(operationId,userId);
    }


    @PutMapping("comment/{operationId}")
    public OperationDTO comment(@RequestBody CommentDto commentDto, @PathVariable(name = "operationId") Long operationId) {
        return operationService.assignCommentToOperation(commentDto,operationId);
    }



    //API TODO
    //api react sur operation
    // dislike operation
    //comment operation
    //update comment operation
    //delete comment operation


}
