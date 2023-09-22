package com.capstone.CapstoneProject.controllers;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    // INDEX
    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id).get(), HttpStatus.OK);
    }

}
