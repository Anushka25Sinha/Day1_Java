package com.example.data;

import com.example.core.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Retrieve employees by ID
    public Employee getEmployeeById(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Retrieve employees by Name
    public List<Employee> getEmployeesByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                result.add(emp);
            }
        }
        return result;
    }

    // Update employee
    public void updateEmployee(int id, String name, int age, String department) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(name);
            emp.setAge(age);
            emp.setDepartment(department);
        }
    }

    @Override
    public String toString() {
        return "EmployeeRepository{" + "employees=" + employees + '}';
    }
}
