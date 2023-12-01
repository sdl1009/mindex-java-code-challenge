package com.mindex.challenge.data;

public class ReportingStructure {

    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee) {

        this.employee = employee;
        //number of direct reports for employee
        this.numberOfReports = employee.getDirectReports().size();

    }

}
