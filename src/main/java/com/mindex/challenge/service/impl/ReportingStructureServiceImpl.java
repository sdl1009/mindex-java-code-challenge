package com.mindex.challenge.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.mongodb.core.aggregation.Aggregation;
// import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
// import org.springframework.data.mongodb.core.aggregation.GraphLookupOperation;
// import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.ReportingStructureService;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{
    
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    // @Autowired
    // private MongoTemplate mongoTemplate;

    //Attempt 2 at getting all nested directReports

    // //Helper to find nested directReports
    // public long getTotalReports(String id) {
    //     AggregationOperation matchOperation = Aggregation.match(Criteria.where("employeeId").is(id));
    //     GraphLookupOperation graphLookupOperation = GraphLookupOperation.builder()
    //             .from("employee")
    //             .startWith("directReports")
    //             .connectFrom("directReports")
    //             .connectTo("reports")
    //             .as("allReports");

    //     Aggregation aggregation = Aggregation.newAggregation(matchOperation, graphLookupOperation);
    //     List<Employee> results = mongoTemplate.aggregate(aggregation, "employee", Employee.class).getMappedResults();

    //     // Remove the root employee from the list
    //     results.remove(0);

    //     return results.size();
    // }

    @Override
    public ReportingStructure read(String id) {
        LOG.debug("Creating reportingStructure with id [{}]", id);

        //finds reportingStructure by employeeId returns employee
        Employee employee = employeeRepository.findByEmployeeId(id);

        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        
        //init reportStucture obj w/ employee
        ReportingStructure reportingStructure = new ReportingStructure(employee);

        return reportingStructure;
    }

}
