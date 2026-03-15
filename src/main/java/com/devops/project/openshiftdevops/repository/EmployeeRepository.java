package com.devops.project.openshiftdevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.project.openshiftdevops.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}