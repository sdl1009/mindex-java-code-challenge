package com.mindex.challenge.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReportingStructure {

    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee) {

        this.employee = employee;
        
        //bfs for getting all records
        if (employee == null) {
            this.numberOfReports = 0;
        }

        this.numberOfReports = 0;
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(employee);

        while (!queue.isEmpty()) {
            Employee currentEmployee = queue.poll();
            this.numberOfReports++;

            List<Employee> directReports = currentEmployee.getDirectReports();
            if (directReports != null) {
                queue.addAll(directReports);
            }
        }

    }

}
