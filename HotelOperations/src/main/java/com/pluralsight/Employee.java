package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    //Employee Variables
    private String name;
    private int employeeId;
    private String department;
    private double payRate;
    private float hoursWorked;
    private float regularHours;
    private float overTimeHours;
    private double totalPay;
    private double punchIn;
    private double punchOut;

    //Constructors
    public Employee(String name, int employeeId, String department, double payRate, double regularHours, double overTimeHours, double totalPay, double punchIn, double punchOut) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.regularHours = regularHours;
        this.overTimeHours = overTimeHours;
        this.totalPay = totalPay;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getPunchIn() {
        return punchIn;
    }

    public void setPunchIn(double punchIn) {
        this.punchIn = punchIn;
    }

    public double getPunchOut() {
        return punchOut;
    }

    public void setPunchOut(double punchOut) {
        this.punchOut = punchOut;
    }
}
