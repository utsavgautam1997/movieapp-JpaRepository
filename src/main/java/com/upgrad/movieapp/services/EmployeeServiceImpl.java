package com.upgrad.movieapp.services;

import com.upgrad.movieapp.dao.EmployeeDao;
import com.upgrad.movieapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    public EmployeeDao employeeDao;

    @Override
    public Employee saveDetails(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAllEmp() {
        return employeeDao.findAll();
    }

    @Override
    public List<Employee> acceptMultipleEmployeeDetails(List<Employee> employees) {
        List<Employee> savedEmployees = new ArrayList<>();
        for(Employee employee : employees){
            savedEmployees.add(saveDetails(employee));
        }
        return savedEmployees;
    }

    @Override
    public Employee getDetails(String employeeId)  {
        return employeeDao.getEmployeeByEmployeeId(employeeId);

    }

    @Override
    public Employee updateDetails(String employeeId, Employee employee) {
        Employee savedEmployee = (Employee) getDetails(employeeId);

        savedEmployee.setEmployeeName(employee.getEmployeeName());
        savedEmployee.setDesingnation(employee.getDesingnation());
        savedEmployee.setEmployeeCity(employee.getEmployeeCity());
        savedEmployee.setEmployeeEmail(employee.getEmployeeEmail());
        savedEmployee.setEmployeeId(employee.getEmployeeId());
        savedEmployee.setCompanyName(employee.getCompanyName());
        savedEmployee.setMobileNo(employee.getMobileNo());

        return employeeDao.save(savedEmployee);
    }



    @Override
    public Employee deleteDetails(String employeeId) {
        Employee savedEmployee = (Employee) getDetails(employeeId);
        if (savedEmployee == null){
            return  null;
        }
        employeeDao.delete(savedEmployee);
        return  null;

    }
}
