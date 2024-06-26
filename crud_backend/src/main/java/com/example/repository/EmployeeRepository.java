package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	List<Employee> findByEmailId(String email);
	List<Employee> findByFirstName(String fn);
}
