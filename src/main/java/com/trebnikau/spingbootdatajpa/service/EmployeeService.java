package com.trebnikau.spingbootdatajpa.service;

import com.trebnikau.spingbootdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> readAllEmployees();
    List<Employee> readAllEmployeesByName(String name);

    Employee readEmployee(int employeeId);

    void deleteEmployee(int employeeId);
}
