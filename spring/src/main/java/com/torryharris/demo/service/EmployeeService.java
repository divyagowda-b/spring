package com.torryharris.demo.service;

import com.torryharris.demo.model.Employee;
import com.torryharris.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        System.out.println("getAllEmployees");
        return employeeRepository.findAll(); // SELECT * FROM ...
    }

    public Employee getEmployeeById(int eid) {
        System.out.println("getEmployeeById");
        return employeeRepository.findById(eid).get(); // SELECT * FROM ... WHERE ...
    }

    public Employee addEmployee(Employee emp) {
        System.out.println("addEmployee");
        return employeeRepository.save(emp); // INSERT INTO ...
    }

    public Employee updateEmployee(Employee emp) {
        System.out.println("updateEmployee");
        return employeeRepository.save(emp); // UPDATE ...
    }

    public Employee deleteEmployee(int eid) {
        System.out.println("deleteEmployee " + eid);
        employeeRepository.deleteById(eid); // DELETE
        return null;
    }
}