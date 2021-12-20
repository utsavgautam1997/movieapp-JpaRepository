package com.upgrad.movieapp.Dto;

import com.upgrad.movieapp.entities.Employee;

import javax.persistence.Column;
import java.util.Set;

public class ProjectDto {
    private int Id;
    private String projectId ;
    private String employeeId ;
    private String ProjectName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
}
