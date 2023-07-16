package com.example.mybatis.controller;

import com.example.mybatis.dto.EmployeeDto;
import com.example.mybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findUsingId(@PathVariable Integer id){
        return new ResponseEntity<>(employeeService.findEmployeeUsingId(id),HttpStatus.OK);
    }
}
