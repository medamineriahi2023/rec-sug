package com.fseg.management.services;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.services.abstracts.ICrudService;

public interface OperationService extends ICrudService<OperationDTO> {
    OperationDTO likeAnOperation(Long operationId , String userId);
    OperationDTO dislikeAnOperation(Long operationId , String userId);
    OperationDTO assignCommentToOperation(CommentDto comment, Long operationId);
}
