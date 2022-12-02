package com.in28minutes.jpa.hibernate.demo;

 
 
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

import com.in28minutes.jpa.hibernate.demo.entity.Employee;
import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;
import com.in28minutes.jpa.hibernate.demo.repository.PassportRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;
 

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private PassportRepository passportRepository;


	/*
	 * @Autowired private StudentRepository studentRepository;
	 */

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    
    @Override
    public void run(String... arg0) throws Exception {


    	Passport p=new Passport("1234",LocalDate.now());
    	passportRepository.insert(p);
    	
    	
    	
    	
//    	Passport p1=new Passport("Shyam",LocalDate.of(2022,12,1));
    	Employee e=new Employee("Ram",5000.0,p);
    	
    	e.setpassport(p);
//    	Employee e1=new Employee("Shyam",15000.0,p1);
    	System.out.println("Before persisting:"+e);
    	
    	
    	employeeRepository.insert(e);
//    	employeeRepository.insert(e1);
    	
		/*
		 * Employee ex=employeeRepository.findById(1L);
		 * 
		 * System.out.println("Retrieve back after persisting:"+ex);
		 * 
		 * ex.setSalary(9000);
		 * 
		 * System.out.println("Changing employee with id 1 outside the transaction"+ex);
		 * employeeRepository.save(ex);
		 * 
		 * logger.info("Full Time Employees -> {}",
		 * employeeRepository.retrieveEmployees());
		 */
       
    	        
    	        
		/*
		 * studentRepository.insert(new Student("Rahul"));
		 * logger.info("Full Time Students -> {}",
		 * studentRepository.retrieveStudents());
		 */


    }

    
    
}