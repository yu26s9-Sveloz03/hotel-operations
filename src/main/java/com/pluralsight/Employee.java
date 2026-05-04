package com.pluralsight;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (getHoursWorked() < 40) {
            return 0;
        } else {
            return getHoursWorked() - 40;
        }
    }

    public double getRegularPay() {
        return getRegularHours() * getPayRate();
    }

    public double getOvertimePay() {
        return getOvertimeHours() * getPayRate() * 1.5;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
