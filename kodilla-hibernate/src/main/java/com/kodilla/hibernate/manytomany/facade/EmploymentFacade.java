package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmploymentFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;


    public List <Company> findCompanyByPartName(String name) {
        return companyDao.findCompanyByPartName(name);

    }

    public List <Employee> findEmployeeByPartName (String name) {
        return employeeDao.findEmployeeByPartName(name);
    }
}
