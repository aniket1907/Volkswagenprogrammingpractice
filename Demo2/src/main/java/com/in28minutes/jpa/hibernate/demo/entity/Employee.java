package com.in28minutes.jpa.hibernate.demo.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 

@Entity
public  class Employee {
 
    @Id
    @GeneratedValue
    private Long id;
    private double salary;

    public double getSalary() {
        return salary;
    }
@OneToOne

    private Passport passport;

   public void setSalary(double salary) {
        this.salary = salary;
    }
 
    @Column(nullable = false)
    private String name;
 
    protected Employee() {
    }
 
    public Employee(String name,double d,Passport passport) {
        this.name = name;
        this.salary=d;
        this.passport=passport;
    }
 
    public Passport getpassport() {
		return passport;
	}

	public void setpassport(Passport passport) {
		passport = passport;
	}

	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Long getId() {
        return id;
    }
 
  


}