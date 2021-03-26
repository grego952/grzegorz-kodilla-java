package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.EmploymentFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmploymentFacade employmentFacade;

    @Test
    void testSaveManyToMany() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaestres = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaestres.getEmployees().add(stephanieClarckson);
        dataMaestres.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaestres);
        lindaKovalsky.getCompanies().add(dataMaestres);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaestres);
        int dataMaestersId = dataMaestres.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }

    }

    @Test
    void testNamedQueriesForEmployeesWithGivenLastName() {
        //Given
        Employee employee = new Employee("George", "Catfish");
        Employee employee1 = new Employee("John", "Catfish");
        Employee employee2 = new Employee("Frank", "Linder");

        //When
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        List<Employee> employeesWithGivenLastName = employeeDao.findEmployeeByLastName("Catfish");

        //Then
        assertEquals(2, employeesWithGivenLastName.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    void testLookingForCompaniesWith3Chars() {
        //Given
        Employee employee = new Employee("George", "Catfish");
        Employee employee1 = new Employee("John", "Catfish");
        Employee employee2 = new Employee("Frank", "Linder");

        Company company = new Company("ROBTECH");
        Company company1 = new Company("ROBOCORP");
        Company company2 = new Company("TECH-TECH");

        company.getEmployees().add(employee);
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);

        employee.getCompanies().add(company);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        //When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);

        List<Company> threeCharsCompanies = companyDao.companiesWithThreeFirstChars("ROB");

        //Then
        assertEquals(2, threeCharsCompanies.size());

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    void findCompanyByPartName() {
        //Given
        Company company1 = new Company("Big Joe Carpets");
        Company company2 = new Company("Small John Carpets");

        //When
        companyDao.save(company1);
        companyDao.save(company2);

        List<Company> numberOfCompanies = employmentFacade.findCompanyByPartName("Carp");

        //Then
        assertEquals(2, numberOfCompanies.size());

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    void findEmployeeByPartName() {
        //Given
        Employee employee1 = new Employee("Tom", "Hardy");
        Employee employee2 = new Employee("Jim", "Hardy");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        List <Employee> numberOfEmployees = employmentFacade.findEmployeeByPartName("Hard");

        //Then
        assertEquals(2, numberOfEmployees.size());

        //CleanUp
        employeeDao.deleteAll();

    }
}
