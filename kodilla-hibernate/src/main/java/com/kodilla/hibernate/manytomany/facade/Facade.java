package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import static com.kodilla.hibernate.manytomany.facade.SQLCondition.sqlCondition;

@Service
public class Facade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyByNameFrament(String nameFragment){
        return companyDao.retrieveCompanyByNameFragment(sqlCondition(nameFragment));
    }

    public List<Employee> searchEmployeeByLastNameFragment(String lastNameFragment) {
        return employeeDao.retrieveEmployeesByLastnameFragment(sqlCondition(lastNameFragment));
    }
}
