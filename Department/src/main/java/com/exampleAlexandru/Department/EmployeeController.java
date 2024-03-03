package com.exampleAlexandru.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody String employeeBody) {
        return new ResponseEntity<Employee>(employeeService.createEmployee("employeeBody"),HttpStatus.CREATED);
    }
}
