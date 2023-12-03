package com.mindex.challenge.data;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Compensation {
    
    private Employee employee;
    private int salary;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-dd-MM")
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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

}
