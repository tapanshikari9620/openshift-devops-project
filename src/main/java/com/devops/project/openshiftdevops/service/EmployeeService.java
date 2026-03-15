package com.devops.project.openshiftdevops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.project.openshiftdevops.entity.Employee;
import com.devops.project.openshiftdevops.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee emp) {
        Employee employee = repository.findById(id).orElse(null);

        if (employee != null) {
            employee.setEmp_name(emp.getEmp_name());
            employee.setEmp_email(emp.getEmp_email());
            employee.setEmp_department(emp.getEmp_department());
            employee.setEmp_salary(emp.getEmp_salary());
            employee.setJoining_date(emp.getJoining_date());

            return repository.save(employee);
        }

        return null;
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}