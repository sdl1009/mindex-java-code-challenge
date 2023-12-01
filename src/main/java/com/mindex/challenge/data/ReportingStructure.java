package com.mindex.challenge.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReportingStructure {

    private String employeeId;
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(){}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfReports(){

        if (employee == null) {
            return 0;
        }

        int totalEmployees = 0;
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(employee);

        while (!queue.isEmpty()) {
            Employee currentEmployee = queue.poll();
            totalEmployees++;

            List<Employee> directReports = currentEmployee.getDirectReports();
            if (directReports != null) {
                queue.addAll(directReports);
            }
        }

        return totalEmployees;

    }

    public void setNumberOfReports(int numberOfReports){
        this.numberOfReports = numberOfReports;
    }
    
    
}

// public class ReportingStructure {

//     private Employee employee;
//     private int numberOfReports;

//     public ReportingStructure(Employee employee) {

//         this.employee = employee;
//         //number of direct reports for employee
//         this.numberOfReports = employee.getDirectReports().size();

//     }

// }
