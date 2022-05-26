package com.trebnikau.spingbootdatajpa.service;

import com.trebnikau.spingbootdatajpa.dao.EmployeeRepository;
import com.trebnikau.spingbootdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> readAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public List<Employee> readAllEmployeesByName(String name) {
        List<Employee> employeesByName = employeeRepository.findAllByName(name);
        return employeesByName;
    }

    @Override
    public Employee readEmployee(int employeeId) {
        Employee employee = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
        } /*else {
            // some exception
        }*/
        return employee;
    }


    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

}
