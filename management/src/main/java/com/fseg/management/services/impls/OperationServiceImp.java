package com.fseg.management.services.impls;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.entities.Comment;
import com.fseg.management.entities.Operation;
import com.fseg.management.entities.React;
import com.fseg.management.mappers.CommentMapper;
import com.fseg.management.mappers.OperationMapper;
import com.fseg.management.repository.CommentRepository;
import com.fseg.management.repository.OperationsRepository;
import com.fseg.management.repository.ReactRepository;
import com.fseg.management.services.OperationService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceImp implements OperationService {

    private final OperationsRepository operationsRepository;
    private final ReactRepository reactRepository;
    private final CommentRepository commentRepository;

    @Override
    public OperationDTO save(OperationDTO dto) {
        Operation operation = OperationMapper.dtoToEntity(dto);
        OperationDTO operationDTO = OperationMapper.entityToDto(operationsRepository.save(operation));
        return operationDTO;
    }

    @Override
    public OperationDTO update(OperationDTO dto) {
        Operation operation = OperationMapper.dtoToEntity(dto);
        OperationDTO operationDTO = OperationMapper.entityToDto(operationsRepository.save(operation));
        return operationDTO;
    }

    @Override
    public void delete(Long id) {
            operationsRepository.deleteById(id);
    }

    @Override
    public List<OperationDTO> getAll() {
        List<OperationDTO> operationDTOS = operationsRepository.findAll().stream().map(OperationMapper::entityToDto).toList();

        return operationDTOS;
    }

    @Override
    @Transactional
    public OperationDTO likeAnOperation(Long operationId, String userId) {
        Operation operation = operationsRepository.findById(operationId).orElseThrow(()-> new RuntimeException());
        List<React> reacts = operation.getReact();

        for (React react : reacts) {
            if (react.getUserId().equals(userId)) {
                reacts.remove(react);
                return OperationMapper.entityToDto(operation);
            }
        }

        React newReact = new React();
        newReact.setReaction(true);
        newReact.setUserId(userId);
        reactRepository.save(newReact);
        reacts.add(newReact);
        operation.setReact(reacts);
        return OperationMapper.entityToDto(operation);
    }

    @Override
    @Transactional
    public OperationDTO dislikeAnOperation(Long operationId, String userId) {
        Operation operation = operationsRepository.findById(operationId).orElseThrow(()-> new RuntimeException());
        List<React> reacts = operation.getReact();

        for (React react : reacts) {
            if (react.getUserId().equals(userId)) {
                reacts.remove(react);
                return OperationMapper.entityToDto(operation);
            }
        }

        React newReact = new React();
        newReact.setReaction(false);
        newReact.setUserId(userId);
        reactRepository.save(newReact);
        reacts.add(newReact);
        operation.setReact(reacts);
        return OperationMapper.entityToDto(operation);
    }

    @Transactional
    @Override
    public OperationDTO assignCommentToOperation(CommentDto comment, Long operationId) {
        Operation operation = operationsRepository.findById(operationId).orElseThrow();
        List<Comment> comments = operation.getComments();
        Comment comment1 = commentRepository.save(CommentMapper.dtoToEntity(comment));
        comments.add(comment1);
        operation.setComments(comments);
        return OperationMapper.entityToDto(operation);
    }



}
