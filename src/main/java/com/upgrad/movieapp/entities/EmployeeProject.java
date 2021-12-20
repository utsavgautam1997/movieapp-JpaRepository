package com.upgrad.movieapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeProject")
public class EmployeeProject {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "employee_name",length = 50)
    private String employeeName;
    @Column(name = "project_name")
    private String ProjectName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
