package com.upgrad.movieapp.services;

import com.upgrad.movieapp.entities.Project;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    public Project saveProjectDetails(Project project);
    public Project getDetails(int id);
    public Project updateDetails(int id , Project project );
    public Project deleteDetails(int id );
    public List<Project> getAllPro();
    public List<Project> getProByEmpCode(String employeeId);
    public Map<String,String> getProjetEmpName() throws Exception;
}
