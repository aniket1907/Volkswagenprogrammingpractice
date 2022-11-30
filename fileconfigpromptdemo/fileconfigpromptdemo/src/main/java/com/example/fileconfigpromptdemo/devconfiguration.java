package com.example.fileconfigpromptdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.fileconfigpromptdemo.model.HelloWorld;

@Configuration
@Profile("dev")
public class devconfiguration {

	@Autowired
	appconfigprop prop;
	
	@Bean("hi")
	public HelloWorld getHello()
	{
//		return new HelloWorld("Hii everyone!!");
		return new HelloWorld(prop.getMessage());
	}
}
