package com.springcourse.mvc.dao;

import com.springcourse.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
