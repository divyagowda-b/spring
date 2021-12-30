package com.torryharris.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.torryharris.demo.model.Employee;

@Service
public class EmployeeService {

    public List<Employee> empList = new ArrayList<>();

    {
        empList.add(new Employee(101, "Sonu", 45000));
        empList.add(new Employee(102, "Monu", 40000));
        empList.add(new Employee(103, "Tonu", 50000));
        empList.add(new Employee(104, "Ponu", 35000));
        empList.add(new Employee(105, "Gonu", 60000));
    }

    public List<Employee> getAllEmployees() {
        System.out.println("getAllEmployees");
        return empList;
    }

    public Employee getEmployeeById(int eid) {
        System.out.println("getEmployeeById");
        return empList.get(0);
    }
    public Employee addEmployee(Employee emp) {
        System.out.println("addEmployee");
        empList.add(emp);
        return emp;
    }
    public Employee updateEmployee(Employee emp) {
        System.out.println("updateEmployee");
       // empList.add(emp);
        return emp;
    }
    public Employee deleteEmployee(int eid) {
        System.out.println("addEmployee");
        //empList.add(emp);
        return null;
    }
}
