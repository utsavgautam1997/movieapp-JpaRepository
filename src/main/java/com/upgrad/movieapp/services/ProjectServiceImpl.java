package com.upgrad.movieapp.services;

import com.upgrad.movieapp.dao.ProjectDao;
import com.upgrad.movieapp.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements  ProjectService{
    @Autowired
    public ProjectDao projectDao;

    @Override
    public Project saveProjectDetails(Project project) {
        return projectDao.save(project);
    }

    @Override
    public Map<String, String> getProjetEmpName() throws Exception {


            HashMap<String, String> hash_map = new HashMap<String, String>();


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mtb", "root", "Nit@1970");

            Statement stmt = con.createStatement();
            String query = "select project_name,employee_name from  project p   join employee e on p.employee_id=e.employee_id";
            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()) {
                String projectName = rs.getString("project_name");
                String EmployeeName = rs.getString("employee_name");

                //System.out.println(projectName + "  " + EmployeeName);
                hash_map.put(projectName, EmployeeName);
            }
//            System.out.println(hash_map);
            //  System.out.println();
            return hash_map;

        }


    @Override
    public Project getDetails(int id) {
        return projectDao.findById(id).get();
    }
    @Override
    public List<Project> getAllPro() {
        return projectDao.findAll();
    }

    @Override
    public List<Project> getProByEmpCode(String employeeId) {
        return projectDao.getProjectByEmployeecode(employeeId);
    }

    @Override
    public Project updateDetails(int id, Project project) {
       Project savedProject = getDetails(id);

        return null;
    }

    @Override
    public Project deleteDetails(int id) {
        return null;
    }
}
