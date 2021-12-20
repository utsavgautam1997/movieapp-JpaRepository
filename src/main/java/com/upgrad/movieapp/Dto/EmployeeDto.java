package com.upgrad.movieapp.Dto;

import com.sun.istack.NotNull;
import com.upgrad.movieapp.Validator.CustomEmailValidator;
import com.upgrad.movieapp.entities.Project;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

public class EmployeeDto {
    private int Id;
    @NotBlank(message = "please enter Name")
    private String employeeName;
    private String desingnation;
    private String employeeCity;
    @CustomEmailValidator
    private String employeeEmail;
    private String employeeId;
    private String companyName;
    @NotBlank
    @Pattern(regexp = "^[0-9]{10}", message = "please enter a valid mobile number")
    private String mobileNo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesingnation() {
        return desingnation;
    }

    public void setDesingnation(String desingnation) {
        this.desingnation = desingnation;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
