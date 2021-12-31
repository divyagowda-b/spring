//package com.torryharris.demo.controller;
//
//import com.torryharris.demo.model.Employee;
//import com.torryharris.demo.service.DepartmentService;
//import com.torryharris.demo.service.EmployeeService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class DepartmentController {
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//
//    @GetMapping("/getdeptbyid/{did}")
//    public Employee getDepartmentById(@PathVariable(name = "did") int did) {
//        LOG.info("getDepartmentById " + did);
//        return departmentService.getDepartmentById(did);
//    }
//
//    @GetMapping("/getdeptbyname/{dname}")
//    public Employee getDepartmentByDepartmentName(@PathVariable(name = "dname") String dname) {
//        LOG.info("getDepartmentByDepartmentName " + dname);
//        return departmentService.getDepartmentByDepartmentName(dname);
//    }
//
//    @GetMapping("/getdeptbycity/{dcity}")
//    public Employee getDepartmentByCity(@PathVariable(name = "dcity") String dcity) {
//        LOG.info("getDepartmentByCity " + dcity);
//        return departmentService.getDepartmentByCity(dcity);
//    }
//
//
//
//
//    @GetMapping("/deptlist")
//    public List<Department> deptList() {
//        LOG.info("deptList");
//        return DepartmentService.getAllDepartments();
//    }
//
//    @PostMapping("/adddept")
//    public Department addDept(@RequestBody Department dept) {
//        LOG.info("addDept");
//        return DepartmentService.addDepartment(dept);
//    }
//
//    @PutMapping("/updateemp")
//    public Employee updateEmp(@RequestBody Employee emp) {
//        LOG.info("updateEmp");
//        return employeeService.updateEmployee(emp);
//    }
//}

