package com.fseg.management.dtos;

import com.fseg.management.entities.Image;
import com.fseg.management.entities.React;
import com.fseg.management.enums.Status;
import jakarta.persistence.*;
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

    private List<React> react ;

    private List<Image> images;
}
