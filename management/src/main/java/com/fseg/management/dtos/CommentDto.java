package com.fseg.management.dtos;


import com.fseg.management.entities.Image;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentDto {

    private Long id;
    private String userId;


    private List<ImageDTO> images;

    private String content;


    private Date creationDate;

}
