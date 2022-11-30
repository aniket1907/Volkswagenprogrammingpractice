package com.example.fileconfigpromptdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fileconfigpromptdemo.model.Employee;
import com.example.fileconfigpromptdemo.model.HelloWorld;

@Configuration
public class defaultconfiguration {

	@Autowired
	appconfigprop prop;
	
	@Bean("emp")
	public Employee getemp(){

		int id=prop.getEmp().getEmpId();
		String s=prop.getEmp().getEmpname();
		Double d=prop.getEmp().getSalary();
		return new Employee(id,s,d);

//		return new Employee(1,"Ram",5000);

	}
}
