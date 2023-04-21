package com.fseg.management.mappers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.dtos.ReactDTO;
import com.fseg.management.entities.Image;
import com.fseg.management.entities.React;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class ReactMapper {

    public static React dtoToEntity(ReactDTO dto){
        React react = new React();
         BeanUtils.copyProperties(dto, react);
         return react;
    }


    public static ReactDTO entityToDto(React entity){
        ReactDTO reactDTO = new ReactDTO();
        BeanUtils.copyProperties(entity, reactDTO);
        return reactDTO;
    }

    public static List<React> getEntityList(List<ReactDTO> reactDTOS){
        return reactDTOS.stream().map(ReactMapper::dtoToEntity).toList();
    }

    public static List<ReactDTO> getDtoList(List<React> images){
        return images.stream().map(ReactMapper::entityToDto).toList();
    }



}
