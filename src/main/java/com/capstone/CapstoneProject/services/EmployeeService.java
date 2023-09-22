package com.capstone.CapstoneProject.services;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
}
