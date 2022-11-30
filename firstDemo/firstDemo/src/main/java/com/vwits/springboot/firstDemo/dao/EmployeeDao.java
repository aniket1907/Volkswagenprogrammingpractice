package com.vwits.springboot.firstDemo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vwits.springboot.firstDemo.model.Book;
import com.vwits.springboot.firstDemo.model.Employee;

@Service
public class EmployeeDao {
    
    List<Employee> emparr;
    
    public EmployeeDao()
    {
        emparr = new ArrayList<Employee>();
        
        emparr.add(new Employee(1,"Aniket",10000)); 
        emparr.add(new Employee(2,"Bibhishan",20000));
        emparr.add(new Employee(3,"Choudhari",30000));
    }
    
    public boolean addEmployee(Employee b)
    {
        this.emparr.add(b);
        return true;
    }
    
    public Employee getEmployee(int empid)
    {
        
        Employee emp = emparr.stream().filter((b)->{ return
                 b.getEmpId()==empid; }).findFirst().orElse(null);
         
         System.out.println(emp);
         return emp;
   
        
    }
    
    
    public int removeEmployee(Employee b)
    {
        
        
        boolean status = this.emparr.remove(b);
        
        if(status)
          return b.getEmpId();
        else
            return -1;
    }
    
    /*
    public int removeBook(int bookId)
    {
        
      //this.bookarr.toArray();
        
        
    }
    */



   public List<Employee> getAllEmployees()
    {
        return this.emparr;
    }
}