package com.sm.controller;

import com.sm.dto.EmployeeDto;
import com.sm.entity.Employee;
import com.sm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<EmployeeDto> findAllProducts() {
        return service.getEmployees();
    }
}
