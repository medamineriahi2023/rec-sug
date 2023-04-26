package com.fseg.management.services.impls;


import com.fseg.management.dtos.CommentDto;
import com.fseg.management.entities.Comment;
import com.fseg.management.mappers.CommentMapper;
import com.fseg.management.repository.CommentRepository;
import com.fseg.management.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {


    private final CommentRepository commentRepository;



    @Override
    public CommentDto save(CommentDto dto) {
        Comment comment = CommentMapper.dtoToEntity(dto);
        return CommentMapper.entityToDto(commentRepository.save(comment));

    }

    @Override
    public CommentDto update(CommentDto dto) {
        Comment comment = CommentMapper.dtoToEntity(dto);
        return CommentMapper.entityToDto(commentRepository.save(comment));

    }

    @Override
    public void delete(Long id) {
        commentRepository.deleteById(id);
        //TODO add exception in case id not found exception returned with ErrorResponse
        //TODO add log module

    }

    @Override
    public List<CommentDto> getAll(Sort sort) {
        return CommentMapper.getDtoList(commentRepository.findAll());
    }
}
