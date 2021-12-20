package com.upgrad.movieapp;

import com.upgrad.movieapp.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MovieappApplication {

  public static <ModalMapper> void main(String[] args) {

    ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);
    EmployeeService employeeService = context.getBean(EmployeeService.class);
//    Employee employee1 = new Employee();
//    employee1.setEmployeeName("ravi");
//    employee1.setDesingnation("accountant");
//    employee1.setCompanyName("lumiq");
//
//    Employee savedDetails = employeeService.saveDetails(employee1);
//    System.out.println(savedDetails);
//
//    Employee employee2 = new Employee();
//    employee2.setEmployeeName("rohan");
//
//    employee2.setDesingnation("cook");
//    employee2.setCompanyName("google");
//
//    Employee update_des =  employeeService.updateDetails(1,employee2);
//    System.out.println(update_des);
//
//    Employee searchedEmployee = employeeService.getDetails(update_des.getEmployeeId());
//    System.out.println("searched "+ searchedEmployee);

   // MovieDao movieDao = context.getBean(MovieDao.class);
//    EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
//    //Movie movie = new Movie();
//    Employee employee = new Employee();
//    employee.setEmployeeName("utsav");
//    employee.setDesingnation("java developer");
//    employee.setCompanyName("lumiq");
//    movie.setMovieName("Avengers: Infinity War");
//    movie.setMovieDescription("The Avengers must stop Thanos, an intergalactic warlord, " +
//        "from getting his hands on all the infinity stones.");
//    movie.setReleaseDate(LocalDateTime.of(2018, 4, 27, 5, 30));
//    movie.setDuration(150);
//    movie.setCoverPhotoUrl("cover-photo-url");
//    movie.setTrailerUrl("trailer-url");
//
//    System.out.println("Before Saving: " + movie);
  //  System.out.println("before saving" + employee);

//    Movie savedMovie = movieDao.save(movie);
//    System.out.println("After saving: " + savedMovie);

   // Employee savedemployee = employeeDao.save(employee);
   //System.out.println("after saving employee" + savedemployee);

//    Movie retrievedMovie = movieDao.findById(savedMovie.getMovieId()).orElse(null);
//    System.out.println("After retrieving: " + retrievedMovie);

//    movie.setDuration(160);
//    Movie updatedMovie = movieDao.save(movie);
//    System.out.println("After updating: " + updatedMovie);
//    movie.setMovieName("dangal");
//    movie.setDuration(120);
//    movie.setMovieDescription("movie on wrestling");
//    Movie saveMovie = movieDao.save(movie);

//    movieDao.delete(updatedMovie);
//    System.out.println("After deleting: " + movieDao.findById(updatedMovie.getMovieId()));

//    CustomerDao customerDAO = context.getBean(CustomerDao.class);
//
//    Customer customer = new Customer();
//    customer.setFirstName("Emma");
//    customer.setLastName("Stone");
//    customer.setUsername("email123stone");
//    customer.setPassword("*******");
//    customer.setDateOfBirth(LocalDateTime.of(1988,11,6,0,0));
//
//    System.out.println("Before saving : "+customer);
//    Customer savedCustomer = customerDAO.save(customer);
//
//    System.out.println("After saving : "+ savedCustomer);
//
//    Customer retrievedCustomer = customerDAO.findById(savedCustomer.getCustomerId());
//    System.out.println("Retrieved customer : "+ retrievedCustomer);
//
//
//
//    customer.setUsername("newName");
//
//    Customer updatedCustomer = customerDAO.update(customer);
//    System.out.println("Updated customer : "+ updatedCustomer);



//		customerDAO.delete(updatedCustomer);
//
//		System.out.println("After deleting : "+ customerDAO.findById(updatedCustomer.getCustomerId()));
  }
  @Bean
  public ModelMapper modelMapper(){return  new ModelMapper();}


}
