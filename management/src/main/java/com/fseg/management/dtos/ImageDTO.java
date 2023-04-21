package com.fseg.management.dtos;

import com.fseg.management.entities.Image;
import com.fseg.management.entities.React;
import com.fseg.management.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class ImageDTO {
    private Long id;
    private String url;
}
