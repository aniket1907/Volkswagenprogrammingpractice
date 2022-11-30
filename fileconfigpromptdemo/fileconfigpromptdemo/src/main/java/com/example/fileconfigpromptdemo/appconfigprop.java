package com.example.fileconfigpromptdemo;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.fileconfigpromptdemo.model.Book;


@Component
@ConfigurationProperties("app")
public class appconfigprop {
    
    private String message;
    private Employee emp;
    private Book book;


   public Book getBook() {
		return book;
	}



	public void setBook(Book book) {
		this.book = book;
	}



public Employee getEmp() {
        return emp;
    }



   public void setEmp(Employee emp) {
        this.emp = emp;
    }



   public String getMessage() {
        return message;
    }



   public void setMessage(String message) {
        this.message = message;
    }
    
    public static class Employee
    {
        private int empId;
        private String empname;
        private Double salary;
        
        public int getEmpId() {
            return empId;
        }
        public void setEmpId(int empId) {
            this.empId = empId;
        }
        public String getEmpname() {
            return empname;
        }
        public void setEmpname(String empname) {
            this.empname = empname;
        }
        public Double getSalary() {
            return salary;
        }
        public void setSalary(Double salary) {
            this.salary = salary;
        }
    
    }

public static class Book{
	
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}



}