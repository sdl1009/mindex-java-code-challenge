package com.mindex.challenge.data;

import java.sql.Date;

public class Compensation {
    
    private Employee employee;
    private int salary;
    private Date effectiveDate;

    public Compensation(){}

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return effectiveDate;
    }

    public void setDate(Date date) {
        this.effectiveDate = effectiveDate;
    }

}
