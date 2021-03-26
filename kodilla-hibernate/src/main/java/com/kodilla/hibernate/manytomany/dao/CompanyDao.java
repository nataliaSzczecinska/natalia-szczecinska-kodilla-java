package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyByThreeFirstLetter(@Param("START_AT") String startAt);

    @Query
    List<Company> retrieveCompanyByNameFragment(@Param("NAME_FRAGMENT") String nameFragment);
}