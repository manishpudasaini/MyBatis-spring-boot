package com.example.mybatis.mapper;

import com.example.mybatis.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface EmployeeMapper {
    EmployeeDto getEmployeeById(Integer id);
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertEmployee(EmployeeDto employeeDto);
}
