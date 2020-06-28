package com.win2020.resttutorial.repository;

import com.win2020.resttutorial.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
