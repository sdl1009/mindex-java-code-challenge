package com.mindex.challenge.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;

@Repository
public interface CompensationRepository extends MongoRepository<Compensation, Employee>{
    //Custom Query for mongo get whole Employee object with just id
    @Query("{'employee.employeeId': ?0}")
    Compensation findByEmployeeEmployeeId(String employeeId);
}
