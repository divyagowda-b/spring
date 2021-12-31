//package com.torryharris.demo.service;
//
//import com.torryharris.demo.model.Department;
//import com.torryharris.demo.model.Employee;
//import com.torryharris.demo.repository.DepartmentRepository;
//import com.torryharris.demo.repository.EmployeeRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DepartmentService {
//
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    @Autowired
//    DepartmentRepository departmentRepository;
//
//    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//    public List<Department> getAllDepartments() {
//        LOG.info("getAllDepartments");
//        return DepartmentRepository.findAll(); // SELECT * FROM ...
//    }
//
//
//    public Department getDepartmentById(int did) {
//        LOG.info("getDepartmentById");
//        return DepartmentRepository.findById(did).get(); // SELECT * FROM ... WHERE ...
//    }
//    public List<Employee> getEmployeeByFirstName(String firstName) {
//        LOG.info("getEmployeeByFirstName");
//        return employeeRepository.findByFirstName(firstName);
//    }
//    public List<Employee> getEmployeeByCity(String city) {
//        LOG.info("getEmployeeByCity");
//        return employeeRepository.findByDepartment_City(city); // SELECT * FROM ... WHERE ...
//    }
//    public Employee addEmployee(Employee emp) {
//        LOG.info("addEmployee");
//        if (emp.getDepartment() != null) {
//            if (departmentRepository.existsById(emp.getDepartment().getDepartmentId())) {
//                LOG.info("employee added successfully.");
//                return employeeRepository.save(emp); // INSERT INTO ...
//            }
//        }
//        LOG.warn("employee was not added because given department id does not exist.");
//        return null;
//    }
//    public List<Employee> getEmployeeBySalary(double salary) {
//        LOG.info("getEmployeeBySalary");
//        return employeeRepository.findBySalary(salary);
//    }
//
////    public Employee addEmployee(Employee emp) {
////        LOG.info("addEmployee");
////        return employeeRepository.save(emp); // INSERT INTO ...
////    }
//
//
//    public Employee updateEmployee(Employee emp) {
//        LOG.info("updateEmployee");
//        return employeeRepository.save(emp); // UPDATE ...
//    }
//
//    public Employee deleteEmployee(int eid) {
//        LOG.info("deleteEmployee " + eid);
//        employeeRepository.deleteById(eid); // DELETE
//        return null;
//    }
//}
