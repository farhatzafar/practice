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

    public void createEmployee(String firstName, String lastName, String department) {
        if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank()
                || department == null || department.isBlank()) {
            throw new RuntimeException();
        } else {
            repository.save(new Employee(firstName, lastName, department));
        }
    }


}
