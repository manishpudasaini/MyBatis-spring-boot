package com.example.mybatis.mapper;

import com.example.mybatis.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    EmployeeDto getEmployeeById(Integer id);
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> findAllEmployee();
}
