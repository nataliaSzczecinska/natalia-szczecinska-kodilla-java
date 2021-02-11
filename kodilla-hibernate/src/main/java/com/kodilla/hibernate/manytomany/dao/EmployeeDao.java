package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Company, Integer> {

   /* @Query
    List<Employee> retrieveEmployeesByName(@Param("LAST_NAME") String lastName);
*/
}
