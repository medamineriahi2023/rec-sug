package com.fseg.management.mappers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.entities.Image;
import com.fseg.management.entities.Operation;
import org.springframework.beans.BeanUtils;

public class OperationMapper {

    public static Operation dtoToEntity(OperationDTO dto){
        Operation operation = new Operation();

         return operation;
    }


    public static ImageDTO entityToDto(Image entity){
        ImageDTO imageDTO = new ImageDTO();
        BeanUtils.copyProperties(entity, imageDTO);
        return imageDTO;
    }
}
