package com.fseg.management.mappers;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.dtos.DepartmentDto;
import com.fseg.management.entities.Comment;
import com.fseg.management.entities.Department;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class DepartmentMapper {
    public static Department dtoToEntity(DepartmentDto dto){
        Department department = new Department();
        BeanUtils.copyProperties(dto, department);
        return department;
    }


    public static DepartmentDto entityToDto(Department entity){
        DepartmentDto departmentDto = new DepartmentDto();
        BeanUtils.copyProperties(entity, departmentDto);
        return departmentDto;
    }

    public static List<Department> getEntityList(List<DepartmentDto> departmentDtos){
        return departmentDtos.stream().map(DepartmentMapper::dtoToEntity).toList();
    }

    public static List<DepartmentDto> getDtoList(List<Department> departments){
        return departments.stream().map(DepartmentMapper::entityToDto).toList();
    }


}
