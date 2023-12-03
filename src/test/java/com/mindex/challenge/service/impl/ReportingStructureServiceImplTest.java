// package com.mindex.challenge.service.impl;



// import com.mindex.challenge.data.Employee;
// import com.mindex.challenge.data.ReportingStructure;
// import com.mindex.challenge.service.EmployeeService;
// import com.mindex.challenge.service.ReportingStructureService;

// import org.assertj.core.util.Arrays;
// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.boot.web.server.LocalServerPort;
// import org.springframework.http.HttpEntity;
// import org.springframework.http.HttpHeaders;
// import org.springframework.http.HttpMethod;
// import org.springframework.http.MediaType;
// import org.springframework.test.context.junit4.SpringRunner;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotNull;

// import java.util.List;

// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// public class ReportingStructureServiceImplTest {

//     private String reportingStructureEmployeeIdUrl;

//     @Autowired
//     private ReportingStructureService reportingStructureService;

//     @LocalServerPort
//     private int port;

//     @Autowired
//     private TestRestTemplate restTemplate;

//     @Before
//     public void setup() {
//         reportingStructureEmployeeIdUrl = "http://localhost:" + port + "/reportingStructure/{id}";
//     }

//     @Test
//     public void testRead() {

//         Employee testEmployee1 = new Employee();
//         testEmployee1.setEmployeeId("1");
//         testEmployee1.setFirstName("John");
//         testEmployee1.setLastName("Doe");
//         testEmployee1.setDepartment("Engineering");
//         testEmployee1.setPosition("Developer");

//         Employee testEmployee2 = new Employee();
//         testEmployee2.setEmployeeId("2");
//         testEmployee2.setFirstName("Jane");
//         testEmployee2.setLastName("Doe");
//         testEmployee2.setDepartment("Engineering");
//         testEmployee2.setPosition("Developer");

//         Employee testEmployee3 = new Employee();
//         testEmployee3.setEmployeeId("3");
//         testEmployee3.setFirstName("Julie");
//         testEmployee3.setLastName("Doe");
//         testEmployee3.setDepartment("Engineering");
//         testEmployee3.setPosition("Developer");

//         // List<Employee> employee4Reports = Arrays.asList(testEmployee2, testEmployee3);

//         Employee testEmployee4 = new Employee();
//         testEmployee4.setEmployeeId("4");
//         testEmployee4.setFirstName("Jonathon");
//         testEmployee4.setLastName("Doe");
//         testEmployee4.setDepartment("Engineering");
//         testEmployee4.setPosition("Developer");
//         // testEmployee4.setDirectReports(employee4Reports);

//         // List<Employee> employee5Reports = Arrays.asList(testEmployee1, testEmployee4);

//         Employee testEmployee5 = new Employee();
//         testEmployee5.setEmployeeId("5");
//         testEmployee5.setFirstName("Jeremy");
//         testEmployee5.setLastName("Doe");
//         testEmployee5.setDepartment("Engineering");
//         testEmployee5.setPosition("Developer");
//         // testEmployee5.setDirectReports(employee5Reports);

//         ReportingStructure testReportingStructure = new ReportingStructure(testEmployee5);


//         // // Read checks
//         // ReportingStructure readReportingStructure = restTemplate.getForEntity(reportingStructureEmployeeIdUrl, ReportingStructure.class, createdEmployee.getEmployeeId()).getBody();
//         // assertEquals(createdEmployee.getEmployeeId(), readEmployee.getEmployeeId());
//         // assertEmployeeEquivalence(createdEmployee, readEmployee);

//         HttpHeaders headers = new HttpHeaders();
//         headers.setContentType(MediaType.APPLICATION_JSON);

//     }

//     private static void assertEmployeeEquivalence(Employee expected, Employee actual) {
//         assertEquals(expected.getFirstName(), actual.getFirstName());
//         assertEquals(expected.getLastName(), actual.getLastName());
//         assertEquals(expected.getDepartment(), actual.getDepartment());
//         assertEquals(expected.getPosition(), actual.getPosition());
//     }
// }
