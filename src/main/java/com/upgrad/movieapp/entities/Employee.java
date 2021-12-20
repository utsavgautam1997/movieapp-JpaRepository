package com.upgrad.movieapp.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Employee {
        @Id
        @GeneratedValue
        private int Id;
        @Column(name = "employee_name",length = 50)
        private String employeeName;
        @Column(length = 50)
        private String mobileNo;
        @Column(name = "employee_desg", length = 500)
        private String desingnation;
        @Column( length = 500)
        private String employeeCity;
        @Column( length = 500)
        private String employeeEmail;
        @Column(name = "employeeId")
        private String employeeId;
        @Column(name = "company_name", length = 500)
        private String companyName;



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

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", employeeName='" + employeeName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", desingnation='" + desingnation + '\'' +
                ", employeeCity='" + employeeCity + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
