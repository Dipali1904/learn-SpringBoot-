package com.example.employeemanagement.controller;

import com.example.employeemanagement.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employee/test")
    public String test(){
        return employeeService.getTestMessage();
    }
}
