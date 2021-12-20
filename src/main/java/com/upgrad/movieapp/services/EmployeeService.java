package com.upgrad.movieapp.services;

import com.upgrad.movieapp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveDetails(Employee employee);
    public List<Employee> acceptMultipleEmployeeDetails(List<Employee> movies);
    public Employee getDetails(String employeeId);
    public Employee updateDetails(String employeeId , Employee employee );
    public Employee deleteDetails(String employeeId );
    public List<Employee> getAllEmp();


}
