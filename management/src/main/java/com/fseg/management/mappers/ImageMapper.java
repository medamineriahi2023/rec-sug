package com.fseg.management.mappers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.entities.Image;
import org.springframework.beans.BeanUtils;

import java.util.List;

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

    public static List<Image> getEntityList(List<ImageDTO> imageDTOS){
        return imageDTOS.stream().map(ImageMapper::dtoToEntity).toList();
    }

    public static List<ImageDTO> getDtoList(List<Image> images){
        return images.stream().map(ImageMapper::entityToDto).toList();
    }



}
