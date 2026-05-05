package com.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

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
        if (getHoursWorked() > 40) {
            return 40;
        } else {
            return getHoursWorked();
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

    public void punchIn() {
        LocalDateTime startTime = LocalDateTime.now();
        this.startTime = startTime;
    }

    public void punchIn(int time) {
        LocalDate date = LocalDate.now();
        LocalTime manualTime = LocalTime.of(time,0);
        this.startTime = LocalDateTime.of(date,manualTime);
    }

    public void punchOut() {
        LocalDateTime endTime = LocalDateTime.now();
        this.endTime = endTime;
        Duration difference = Duration.between(startTime,this.endTime);
        double shift = difference.toMinutes() / 60.0;
        hoursWorked += shift;
    }

    public void punchOut(int time) {
        LocalDate date = LocalDate.now();
        LocalTime manualTime = LocalTime.of(time,0);
        this.endTime = LocalDateTime.of(date,manualTime);
        Duration difference = Duration.between(startTime,endTime);
        double shift = difference.toMinutes()/ 60.0;
        hoursWorked += shift;
    }

//    public void punchTimeCard(int startTime, int endTime) {
//        if ( endTime > startTime) {
//            int shift = endTime - startTime;
//            hoursWorked += shift;
//        } else {
//            int shift = (24 - startTime) + (endTime);
//            hoursWorked += shift;
//        }
//    }
}
