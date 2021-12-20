package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Employee;
import com.upgrad.movieapp.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employee where employee_id=?1", nativeQuery = true)
    public Employee getEmployeeByEmployeeId (String employeeId);
}
