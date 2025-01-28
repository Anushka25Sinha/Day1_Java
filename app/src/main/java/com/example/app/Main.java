package com.example.app;

import com.example.core.Employee;
import com.example.data.EmployeeRepository;
import com.example.logging.LoggerUtil;
import org.slf4j.Logger;

public class Main {
    private static final Logger logger = LoggerUtil.logger;

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        // Add employees
        repository.addEmployee(new Employee(1, "Arun", 25, "Engineering"));
        repository.addEmployee(new Employee(2, "Arjun", 27, "Finance"));

        logger.info("Employees added.");

        // Retrieve employee by ID
        Employee emp = repository.getEmployeeById(1);
        logger.info("Retrieved employee:  " + emp);

        // Update employee
        repository.updateEmployee(1, "Arun Updated", 26, "Engineering Updated");
        logger.info("Employee updated: " + repository.getEmployeeById(1));

        // Retrieve employees by name
        logger.info("Employees with name 'Arjun': " + repository.getEmployeesByName("Arjun"));
    }
}