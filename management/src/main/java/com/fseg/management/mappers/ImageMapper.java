package com.fseg.management.mappers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.entities.Image;
import org.springframework.beans.BeanUtils;

public class ImageMapper {

    public static Image dtoToEntity(ImageDTO dto){
        Image image = new Image();
         BeanUtils.copyProperties(dto, image);
         return image;
    }


    public static ImageDTO entityToDto(Image entity){
        ImageDTO imageDTO = new ImageDTO();
        BeanUtils.copyProperties(entity, imageDTO);
        return imageDTO;
    }
}
