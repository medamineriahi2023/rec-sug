package com.fseg.management.mappers;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.entities.Image;
import com.fseg.management.entities.Operation;

import java.util.List;

public class OperationMapper {

    public static Operation dtoToEntity(OperationDTO dto){


        Operation operation = new Operation();
        operation.setDescription(dto.getDescription());
        operation.setTopic(dto.getTopic());
        operation.setStatus(dto.getStatus());
        operation.setImages(ImageMapper.getEntityList(dto.getImages()));
        operation.setReact(ReactMapper.getEntityList(dto.getReact()));
        operation.setComments(CommentMapper.getEntityList(dto.getComments()));
        operation.setId(dto.getId());
        operation.setUserId(dto.getUserId());
         return operation;
    }


    public static OperationDTO entityToDto(Operation entity){
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setDescription(entity.getDescription());
        operationDTO.setTopic(entity.getTopic());
        operationDTO.setStatus(entity.getStatus());
        operationDTO.setImages(ImageMapper.getDtoList(entity.getImages()));
        operationDTO.setReact(ReactMapper.getDtoList(entity.getReact()));
        operationDTO.setComments(CommentMapper.getDtoList(entity.getComments()));
        operationDTO.setId(entity.getId());
        operationDTO.setUserId(entity.getUserId());
        return operationDTO;
    }


    public static List<Image> getEntityList(List<ImageDTO> imageDTOS){
        return imageDTOS.stream().map(ImageMapper::dtoToEntity).toList();
    }

    public static List<ImageDTO> getDtoList(List<Image> images){
        return images.stream().map(ImageMapper::entityToDto).toList();
    }

}
