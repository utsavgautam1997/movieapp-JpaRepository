package com.upgrad.movieapp.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Project {
    @Id
    @GeneratedValue
    private int Id;
    @Column
    private String projectId ;
    @Column
    private String employeeId ;
    @Column(name = "project_name")
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

    @Override
    public String toString() {
        return "Project{" +
                "Id=" + Id +
                ", projectId='" + projectId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", ProjectName='" + ProjectName + '\'' +
                '}';
    }
}
