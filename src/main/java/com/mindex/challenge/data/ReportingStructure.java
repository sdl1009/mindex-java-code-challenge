package com.mindex.challenge.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.springframework.data.annotation.Transient;

public class ReportingStructure {

    private Employee employee;
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
    
}