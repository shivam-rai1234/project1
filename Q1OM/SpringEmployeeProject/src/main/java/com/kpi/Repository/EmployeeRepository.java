package com.kpi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpi.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
