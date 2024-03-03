package com.exampleAlexandru.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(String teext){
        Employee employee = new Employee(teext);

        employeeRepository.insert(employee);

        return employee;
    }


}
