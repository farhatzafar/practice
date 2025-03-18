package com.simulation._3.service;

import com.simulation._3.model.Employee;
import com.simulation._3.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {this.repository = repository;}

    public Optional<Employee> findEmployeeByEmployeeId(Long employeeId) {
        return repository.findById(employeeId);
    }

}
