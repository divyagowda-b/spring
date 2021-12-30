package com.torryharris.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id // primary key
    private int employeeId;

    private String firstName;

    private double salary;

    public Employee() {
        super();
    }

    public Employee(int employeeId, String firstName, double salary) {
        super();
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", firstName='" + firstName + '\'' + ", salary=" + salary
                + '}';
    }
}