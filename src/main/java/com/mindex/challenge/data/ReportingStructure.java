package com.mindex.challenge.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.data.annotation.Transient;

public class ReportingStructure {

    @Transient
    private Employee employee;
    @Transient
    private int numberOfReports;

    public ReportingStructure(Employee employee){

        this.employee = employee;

        this.numberOfReports = 0;

        //bfs for getting all records
        if (employee != null) {
            
            Queue<Employee> queue = new LinkedList<>();
            queue.offer(employee);
            numberOfReports -= 1;

            while (!queue.isEmpty()) {
                Employee currentEmployee = queue.poll();
                numberOfReports++;

                List<Employee> directReports = currentEmployee.getDirectReports();
                if (directReports != null) {
                    queue.addAll(directReports);
                }
            }//while
        }//if
    }//constructor

    @Transient
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    @Transient
    public int getNumberOfReports(){

        //Attempt 1 at getting all nested directReports

        //bfs for getting all records
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

        // return totalEmployees - 1;

        return this.numberOfReports;

    }

    public void setNumberOfReports(int numberOfReports){
        this.numberOfReports = numberOfReports;
    }
    
    
}