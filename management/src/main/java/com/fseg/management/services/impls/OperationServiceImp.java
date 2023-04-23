package com.fseg.management.services.impls;

import com.fseg.management.dtos.OperationDTO;
import com.fseg.management.entities.Operation;
import com.fseg.management.mappers.OperationMapper;
import com.fseg.management.repository.OperationsRepository;
import com.fseg.management.services.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceImp implements OperationService {

    private final OperationsRepository operationsRepository;

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
}
