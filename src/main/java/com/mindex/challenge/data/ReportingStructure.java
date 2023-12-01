package com.mindex.challenge.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReportingStructure {

    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(){}

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfReports(){
        return numberOfReports;
    }

    // public int getNumberOfReports(){

    //     //bfs for getting all records
    //     if (employee == null) {
    //         return 0;
    //     }

    //     int totalEmployees = 0;
    //     Queue<Employee> queue = new LinkedList<>();
    //     queue.offer(employee);

    //     while (!queue.isEmpty()) {
    //         Employee currentEmployee = queue.poll();
    //         totalEmployees++;

    //         List<Employee> directReports = currentEmployee.getDirectReports();
    //         if (directReports != null) {
    //             queue.addAll(directReports);
    //         }
    //     }

    //     return totalEmployees - 1;

    // }

    public void setNumberOfReports(int numberOfReports){
        this.numberOfReports = numberOfReports;
    }
    
    
}