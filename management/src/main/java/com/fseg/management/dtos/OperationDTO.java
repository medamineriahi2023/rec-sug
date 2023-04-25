package com.fseg.management.dtos;

import com.fseg.management.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class OperationDTO {
    private Long id;

    private String description;

    private Status status;

    private String topic;

    private String userId;

    private List<ReactDTO> react ;

    private List<ImageDTO> images;

    private List<CommentDto> comments;
}
