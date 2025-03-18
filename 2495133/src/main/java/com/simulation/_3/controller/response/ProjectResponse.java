package com.simulation._3.controller.response;

import com.simulation._3.model.Project;

public class ProjectResponse {

    private Long projectId;
    private String projectName;

    public ProjectResponse(Long projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    // Getters and Setters
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public static ProjectResponse toResponse(Project project){
        return new ProjectResponse(
                project.getProjectId(), project.getProjectName());
    }
}
