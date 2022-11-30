package com.vwits.springboot.firstDemo.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vwits.springboot.firstDemo.dao.BookDao;
import com.vwits.springboot.firstDemo.dao.EmployeeDao;
import com.vwits.springboot.firstDemo.model.Book;
import com.vwits.springboot.firstDemo.model.Employee;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeDao empdao;
    
    @GetMapping("getEmp/{empid}")
    public String getEmpDetails(@PathVariable int empid,ModelMap model)
    {
        System.out.println("inside getempdetails..");
        
        Employee b=empdao.getEmployee(empid);
        
        if(b!=null)
            model.addAttribute("emp1",b);
        else
            model.addAttribute("msg","employee with empid:"+empid+"not found");
        
        return "employee";
    }
}