package com.vwits.springboot.firstDemo.restful;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vwits.springboot.firstDemo.dao.BookDao;
import com.vwits.springboot.firstDemo.dao.EmployeeDao;
import com.vwits.springboot.firstDemo.exceptions.BookNotFoundException;
import com.vwits.springboot.firstDemo.model.Book;
import com.vwits.springboot.firstDemo.model.Employee;

@RestController
public class EmployeeRestController {
    
    @Autowired
    EmployeeDao empdao;
    
    @GetMapping("emp/{empid}")
    public Employee getEmployee(@PathVariable int empid)
    {
        Employee b =  this.empdao.getEmployee(empid);    
        return b;
    }
    
    
    @PostMapping("addemp")
    public String addEmployee(@RequestBody Employee b)
    {
        boolean r = this.empdao.addEmployee(b);
        
        if(r)
        {
            return "Employee with empid:"+b.getEmpId()+" added successfully..";
        }
        else
        {
            return "Not able to add book with empid:"+b.getEmpId();
        }
        
    }
    
    @GetMapping("allemp")
    public List<Employee> getAllEmployees()
    {
        return this.empdao.getAllEmployees();
    }
    
//    org.springframework.web.bind.annotation.DeleteMapping
    @DeleteMapping("rememp")
    public String removeBook(@RequestBody Employee b)
    {
        int empid =this.empdao.removeEmployee(b);
        
        if(empid!=-1)
        {
            return "Employee with empid:"+empid+" deleted successfully";
        }
        else
        {
            return "Not able to delete Employee with empid:"+empid;
        }
        
    }
    
    



}