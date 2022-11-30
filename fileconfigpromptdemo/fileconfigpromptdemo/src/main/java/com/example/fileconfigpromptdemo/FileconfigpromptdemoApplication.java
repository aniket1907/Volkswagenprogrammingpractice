package com.example.fileconfigpromptdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.fileconfigpromptdemo.model.Book;
import com.example.fileconfigpromptdemo.model.Employee;
import com.example.fileconfigpromptdemo.model.HelloWorld;

@SpringBootApplication
public class FileconfigpromptdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FileconfigpromptdemoApplication.class, args);
	
		Employee e =(Employee)context.getBean("emp");
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpId());
		System.out.println(e.getSalary());
//		HelloWorld hw=(HelloWorld)context.getBean("hi");
//		System.out.println(hw.getMessage());
		Book b=(Book)context.getBean("book");
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	
	}

}
