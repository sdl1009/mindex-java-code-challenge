package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReportingStructureServiceImplTest {

    private String reportingStructureEmployeeIdUrl;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setup() {
        reportingStructureEmployeeIdUrl = "http://localhost:" + port + "/reportingStructure/{id}";
    }

    @Test
    public void testRead() {

        Employee testEmployee1 = new Employee();
        testEmployee1.setEmployeeId("1");
        testEmployee1.setFirstName("John");
        testEmployee1.setLastName("Doe");
        testEmployee1.setDepartment("Engineering");
        testEmployee1.setPosition("Developer");

        Employee testEmployee2 = new Employee();
        testEmployee2.setEmployeeId("2");
        testEmployee2.setFirstName("Jane");
        testEmployee2.setLastName("Doe");
        testEmployee2.setDepartment("Engineering");
        testEmployee2.setPosition("Developer");

        Employee testEmployee3 = new Employee();
        testEmployee3.setEmployeeId("3");
        testEmployee3.setFirstName("Julie");
        testEmployee3.setLastName("Doe");
        testEmployee3.setDepartment("Engineering");
        testEmployee3.setPosition("Developer");

        List<Employee> employee1Reports = new ArrayList<>();
        employee1Reports.add(testEmployee2);
        employee1Reports.add(testEmployee3);
        testEmployee1.setDirectReports(employee1Reports);

        ReportingStructure testReportingStructure = new ReportingStructure(testEmployee1);

        // Read checks
        ReportingStructure readReportingStructure = restTemplate.getForEntity(reportingStructureEmployeeIdUrl, ReportingStructure.class, testEmployee1.getEmployeeId()).getBody();
        assertReportingStructureEquivalence(testReportingStructure, readReportingStructure);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

    }

    private static void assertReportingStructureEquivalence(ReportingStructure expected, ReportingStructure actual) {
        assertEquals(expected.getEmployee(), actual.getEmployee());
        assertEquals(expected.getNumberOfReports(), actual.getNumberOfReports());
    }
}
