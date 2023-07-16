package com.example.mybatis.service;

import com.example.mybatis.dto.EmployeeDto;
import com.example.mybatis.exception.UserNotFoundException;
import com.example.mybatis.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;
   public void addEmployee(EmployeeDto employeeDto){
       employeeMapper.insertEmployee(employeeDto);
    }

   public EmployeeDto findEmployeeUsingId(Integer id){
        EmployeeDto singleEmployee =  employeeMapper.getEmployeeById(id);

        if(singleEmployee == null){
            throw new UserNotFoundException("user does not exist");
        }

        return singleEmployee;
    }
}
