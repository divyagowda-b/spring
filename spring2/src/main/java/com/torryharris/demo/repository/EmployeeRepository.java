package com.torryharris.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.torryharris.demo.model.Employee;

import java.util.List;

// JPA, ORM, Spring DATA

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // more code later

    public abstract List<Employee> findByFirstName(String firstName);

    public abstract List<Employee> findBySalary(double salary);

    public abstract List<Employee> findByDepartment_City(String city);

}