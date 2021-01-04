package com.springcourse.mvc.controller;

import com.springcourse.mvc.dao.EmployeeDAO;
import com.springcourse.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);

        System.out.println(allEmployees);
        return "all-employees";
    }
}
