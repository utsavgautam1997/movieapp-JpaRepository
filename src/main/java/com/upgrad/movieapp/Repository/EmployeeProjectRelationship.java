package com.upgrad.movieapp.Repository;

import com.upgrad.movieapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProjectRelationship extends JpaRepository<Employee,Integer> {

}
