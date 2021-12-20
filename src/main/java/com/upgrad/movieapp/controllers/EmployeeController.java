package com.upgrad.movieapp.controllers;


import com.upgrad.movieapp.Dto.EmployeeDto;
import com.upgrad.movieapp.Dto.ProjectDto;
import com.upgrad.movieapp.Exception.RecordNotFoundException;
import com.upgrad.movieapp.Exception.uniqueEntityException;
import com.upgrad.movieapp.entities.Employee;
import com.upgrad.movieapp.entities.EmployeeProject;
import com.upgrad.movieapp.entities.Project;
import com.upgrad.movieapp.services.EmployeeService;
import com.upgrad.movieapp.services.ProjectService;
import com.upgrad.movieapp.services.ProjectServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee_crud/v1")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;
    @Autowired
    public ProjectService projectService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/project",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProject(@RequestBody ProjectDto projectDto){
        Project project= modelMapper.map(projectDto,Project.class);
        Project savedProject = projectService.saveProjectDetails(project);
        ProjectDto projectDto1 = modelMapper.map(savedProject,ProjectDto.class);
        return  new ResponseEntity(projectDto1,HttpStatus.OK);
    }
    @GetMapping(value = "/project" )
    public ResponseEntity getAllProjects(){
        List<Project> ProjectList = projectService.getAllPro();
        List<ProjectDto> proDTOList = new ArrayList<>();

        for(Project project :ProjectList){
            proDTOList.add(modelMapper.map(project, ProjectDto.class));
        }
        return new ResponseEntity(proDTOList, HttpStatus.OK);
    }
    @GetMapping(value = "/project/join" )
    public ResponseEntity getJoinProEmp() throws Exception {

        return new ResponseEntity(projectService.getProjetEmpName(), HttpStatus.OK);
    }
    @GetMapping(value="/project/empcode/{employeeId}")
    public ResponseEntity<List<EmployeeProject>> getProBasedOnEmpCode(@PathVariable(name="employeeId")
                                                                              String employeeId){

        return new ResponseEntity(projectService.getProByEmpCode(employeeId), HttpStatus.OK);
    }
    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE
            )
    public ResponseEntity createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        EmployeeDto employeeDto1;
        try {
            Employee newEmployee = modelMapper.map(employeeDto, Employee.class);
            Employee savedEmployee = employeeService.saveDetails(newEmployee);
             employeeDto1 = modelMapper.map(savedEmployee, EmployeeDto.class);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
            throw new uniqueEntityException("no already exist");

        }
       return new ResponseEntity(employeeDto1 , HttpStatus.OK);
    }

    @GetMapping(value = "/employee" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllEmp(){
        List<Employee> empList = employeeService.getAllEmp();
        List<EmployeeDto> empDTOList = new ArrayList<>();

        for(Employee employee :empList){
            empDTOList.add(modelMapper.map(employee, EmployeeDto.class));
        }
        return new ResponseEntity(empDTOList, HttpStatus.OK);
    }

    @GetMapping(value="/employee/{employeeId}")
    public ResponseEntity getEmpBasedOnId(@PathVariable(name="employeeId") String employeeId){
        return new ResponseEntity(employeeService.getDetails(employeeId), HttpStatus.OK);
    }
    @PutMapping(value ="/employee/{employeeId}" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity updateEmp(@PathVariable(name="employeeId") String employeeId,
                                @Valid @RequestBody EmployeeDto employeeDto)
    {
      Employee newEmp = modelMapper.map(employeeDto,Employee.class);
      Employee updateEmp = employeeService.updateDetails(employeeId,newEmp);
      EmployeeDto employeeDto1 =  modelMapper.map(updateEmp,EmployeeDto.class);
      return new ResponseEntity(employeeDto1,HttpStatus.OK);
    }
    @DeleteMapping(value="/employee/{employeeId}")
    public ResponseEntity deleteEmp(@PathVariable(name="employeeId") String employeeId){
        Employee deleteEmployee;
        try {
            deleteEmployee = employeeService.deleteDetails(employeeId);

        }catch (Exception e){
            throw new RecordNotFoundException("ni mila kuchh");

        }
        return new ResponseEntity(deleteEmployee, HttpStatus.OK );
    }
}
