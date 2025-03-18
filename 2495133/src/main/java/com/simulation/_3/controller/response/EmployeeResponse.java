package com.simulation._3.controller.response;

import com.simulation._3.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeResponse {

    private Long id;
    private String name;
    private String department;
    private List<ProjectResponse> projects;

    public EmployeeResponse(Long id, String name, String department, List<ProjectResponse> projects) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.projects = projects;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<ProjectResponse> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectResponse> projects) {
        this.projects = projects;
    }

    public static EmployeeResponse toResponse(Employee employee){
        List<ProjectResponse> projectResponses = employee.getProjects().stream()
                .map(ProjectResponse::toResponse)
                .collect(Collectors.toList());

        return new EmployeeResponse(
                employee.getEmpId(),
                String.format("%s %s", employee.getFirstName(), employee.getLastName()),
                employee.getDepartment(),
                projectResponses
        );
    }
}
