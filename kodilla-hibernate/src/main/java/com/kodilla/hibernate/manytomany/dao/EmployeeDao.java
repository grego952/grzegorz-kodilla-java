package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository <Employee, Integer> {

    List<Employee> findEmployeeByLastName(@Param("LASTNAME") String lastName);
}
