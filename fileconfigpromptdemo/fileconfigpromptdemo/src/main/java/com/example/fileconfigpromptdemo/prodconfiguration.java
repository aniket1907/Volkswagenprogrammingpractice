package com.example.fileconfigpromptdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fileconfigpromptdemo.model.Book;
import com.example.fileconfigpromptdemo.model.Employee;

@Configuration
public class prodconfiguration {

	
	@Autowired
	appconfigprop prop;
	
	@Bean("book")
	public Book getBook() {
		
		int id=prop.getBook().getPrice();
		String s=prop.getBook().getName();
		return new Book(id,s);
	} 

	
}
