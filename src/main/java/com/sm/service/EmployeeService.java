package com.sm.service;

import com.sm.dto.EmployeeDto;
import com.sm.entity.Employee;
import com.sm.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<EmployeeDto> getEmployees() {
        List<Employee> list = repository.findAll();
        return list.stream().map(EmployeeDto::new).collect(Collectors.toList());
    }

}
