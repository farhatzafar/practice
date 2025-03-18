package com.simulation._3.controller;

import com.simulation._3.controller.response.EmployeeResponse;
import com.simulation._3.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {this.service = service;}

    @GetMapping("{id}")
    public ResponseEntity<EmployeeResponse> getUser(@PathVariable Long id){
        return ResponseEntity.ok(
                service.findEmployeeByEmployeeId(id)
                        .map(EmployeeResponse::toResponse)
                        .orElse(null)
        );
    }




}
