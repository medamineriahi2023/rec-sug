package com.fseg.management.mappers;

import com.fseg.management.dtos.DepartmentDto;
import com.fseg.management.entities.Department;
import org.springframework.beans.BeanUtils;

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

}
