package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
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
    public void testRetrieveEmployeesByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Clarckson");

        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);
        softwareMachine.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);
        lindaKovalsky.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        //Then
        List<Employee> employeeList = employeeDao.retrieveEmployeesByName("Clarckson");
        assertEquals(2, employeeList.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveCompanyByThreeFirstLetter() {
        //Given
        Employee employee1 = new Employee("John", "Smith");

        Company company1 = new Company("Name of first company");
        Company company2 = new Company("Namme of second company");
        Company company3 = new Company("Other company");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee1);
        company3.getEmployees().add(employee1);

        employee1.getCompanies().add(company1);
        employee1.getCompanies().add(company2);
        employee1.getCompanies().add(company3);

        //When
        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        //Then
        List<Company> companyList = companyDao.retrieveCompanyByThreeFirstLetter("Nam");
        assertEquals(2, companyList.size());

        //CleanUp
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            companyDao.deleteById(company3Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}