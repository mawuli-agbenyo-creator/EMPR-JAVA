package com.Payroll;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        //write your code here
        Scanner scnr = new Scanner(System.in);
        int employeeNumber;
        String employeeName;
        Float hourlySalary;
        double weeklyTime, regularTime, overTime;
        double regularpay, overTimePay, netPay;
        System.out.print("Enter Employee Number (00000): ");
        employeeNumber = scnr.nextInt();

        switch (employeeNumber)
        {
            case 82500:
                employeeName = "Joe Odartey";
                break;
            case 82501:
                employeeName = "Isaac Effah";
                break;
            case 82502:
                employeeName = "Eyram sokode";
                break;
            default:
                employeeName = "UNKOWN";
                break;

        }
        System.out.print("Enter Hourly Salary:  ");
        hourlySalary = scnr.nextFloat();
        System.out.print("Enter weekly Time: ");
        weeklyTime = scnr.nextFloat();

        if (weeklyTime < 40)
        {
            regularTime = weeklyTime;
            overTime = 0;
            regularpay = hourlySalary * regularTime;
            overTimePay = 0;
            netPay = regularpay;

        }else {
            regularTime = 40;
            overTime = weeklyTime - 40;
            regularpay = hourlySalary * 40;
            overTimePay = hourlySalary * overTime;
            netPay = regularpay + overTimePay;
        }

        System.out.println("==========================");
        System.out.println("EYRAM BENZ BUS SERVICES ");
        System.out.println("=-=-= Employee Payroll =-=-=-=");
        System.out.println("---------------------------");
        System.out.println("Employee #  " + employeeNumber);
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Hourly Salary:  " + hourlySalary);
        System.out.println("Weekly Time:  " + weeklyTime);
        System.out.println("Regular Pay:  " + overTimePay);
        System.out.print("Total Pay: " + netPay);
    }
}
