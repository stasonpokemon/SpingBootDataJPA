package com.trebnikau.spingbootdatajpa.dao;

import com.trebnikau.spingbootdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findAllByName(String name);




}
