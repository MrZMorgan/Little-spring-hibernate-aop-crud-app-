package com.egor.spring.mvc_hibernate_aop.controller;

import com.egor.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.egor.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyControler {

    private EmployeeDAO employeeDAO;

    @Autowired
    public MyControler(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeDAO.gelAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }
}
