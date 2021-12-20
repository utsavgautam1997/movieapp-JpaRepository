package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Employee;
import com.upgrad.movieapp.entities.EmployeeProject;
import com.upgrad.movieapp.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;
import java.util.List;

public interface ProjectDao extends JpaRepository<Project, Integer> {

    @Query(value = "select * from project where employee_id=?1", nativeQuery = true)
    public List<Project> getProjectByEmployeecode (String employeeId);
}
