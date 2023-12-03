package com.mindex.challenge.dao;

import com.mindex.challenge.data.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

//ReportingStructure also utilizes, if need customization, create new dao file

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEmployeeId(String employeeId);
}
