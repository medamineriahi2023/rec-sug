package com.fseg.management.mappers;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.DepartmentDto;
import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.entities.Comment;
import com.fseg.management.entities.Department;
import com.fseg.management.entities.Image;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class CommentMapper {
    public static Comment dtoToEntity(CommentDto dto){
        Comment comment = new Comment();
        comment.setId(dto.getId());
        if (dto.getImages() != null && dto.getImages().size() > 0)
        comment.setImages(ImageMapper.getEntityList(dto.getImages()));
        comment.setContent(dto.getContent());
        comment.setUserId(dto.getUserId());
        return comment;
    }


    public static CommentDto entityToDto(Comment entity){
        CommentDto commentDto = new CommentDto();
        commentDto.setContent(entity.getContent());
        commentDto.setId(entity.getId());
        commentDto.setCreationDate(entity.getCreationDate());
        commentDto.setUserId(entity.getUserId());
        if (entity.getImages() != null)
        commentDto.setImages(ImageMapper.getDtoList(entity.getImages()));

        return commentDto;
    }

    public static List<Comment> getEntityList(List<CommentDto> commentDtos){
        return commentDtos.stream().map(CommentMapper::dtoToEntity).toList();
    }

    public static List<CommentDto> getDtoList(List<Comment> comments){
        return comments.stream().map(CommentMapper::entityToDto).toList();
    }

}
