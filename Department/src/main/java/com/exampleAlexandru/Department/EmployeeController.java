package com.exampleAlexandru.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
