package com.fseg.management.services.impls;


import com.fseg.management.dtos.DepartmentDto;
import com.fseg.management.entities.Department;
import com.fseg.management.mappers.DepartmentMapper;
import com.fseg.management.repository.DepartmentRepository;
import com.fseg.management.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {


    private final DepartmentRepository departmentRepository;



    @Override
    public DepartmentDto save(DepartmentDto dto) {
        Department department = DepartmentMapper.dtoToEntity(dto);
        return DepartmentMapper.entityToDto(departmentRepository.save(department));

    }

    @Override
    public DepartmentDto update(DepartmentDto dto) {
        Department department = DepartmentMapper.dtoToEntity(dto);
        return DepartmentMapper.entityToDto(departmentRepository.save(department));
    }

    @Override
    public void delete(Long id) {
        departmentRepository.deleteById(id);
        //TODO add exception in case id not found exception returned with ErrorResponse
        //TODO add log module

    }

    @Override
    public List<DepartmentDto> getAll() {
        return DepartmentMapper.getDtoList(departmentRepository.findAll());
    }
}
