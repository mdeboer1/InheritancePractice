/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

import java.util.Scanner;

/**
 *
 * @author mdeboer1
 */
public class TestInterfaceClasses {
    
    public static void main (String [] args){
        
        //Create Scanner variable to user input

        Scanner keyboard = new Scanner(System.in);

        //Create properties for employee information

        String name, hireDate, address, dateOfBirth, SSN, phoneNum;
        double salary, hourlyWage, hoursWorked, commisionPercentage,
                commisionedSalesTotal;
        
        System.out.println("Enter the employee's name, first and last.");
        name = keyboard.nextLine();

        System.out.println("Enter in the employee's hire date.");
        hireDate = keyboard.nextLine();

        System.out.println("Enter in the employee's address.");
        address = keyboard.nextLine();

        System.out.println("Enter in the employee's date of birth.");
        dateOfBirth = keyboard.nextLine();

        System.out.println("Enter in the employee's Social Security Number.");
        SSN = keyboard.nextLine();

        System.out.println("Enter in the employee's phone number.");
        phoneNum = keyboard.nextLine();

        System.out.println("Enter in the employee's hourly wage.");
        hourlyWage = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter in the employee's hours worked.");
        hoursWorked = Double.parseDouble(keyboard.nextLine());
        
        System.out.println("Enter in the employee's salary.");
        salary = Double.parseDouble(keyboard.nextLine());
        
        System.out.println("Enter in the commision percentage.");
        commisionPercentage = Double.parseDouble(keyboard.nextLine());
        
        System.out.println("Enter in the total commisionable sales amount.");
        commisionedSalesTotal = Double.parseDouble(keyboard.nextLine());
        
        // Creates interface package SalariedEmployee
        SalariedEmployee f = new SalariedEmployee(name, hireDate, address,
            dateOfBirth, SSN, phoneNum, salary);

        // Creates interface package HourlyEmployee
        HourlyEmployee g = new HourlyEmployee(name, 
                hireDate, address, dateOfBirth, SSN, phoneNum);
        
        g.setHourlyWage(hourlyWage);
        g.setHoursWorked(hoursWorked);
        
        // Creates interface package SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee h = new SalaryPlusCommisionEmployee(name,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        h.setCommisionPercentage(commisionPercentage);
        h.setCommisionedSalesAmount(commisionedSalesTotal);
        
        System.out.println("The first employee's name is: " + f.getName() +
                    ".  Their hire date is: " + f.getHireDate() + ".  Their address "
                    + "is: " + f.getAddress() + ".  Their date of birth is: " +
                    f.getDateOfBirth() + ".  Their Social Security Number is: " +
                    f.getSSN() + ".  Their phone number is: " + f.getPhoneNum() +
                    ".  Their salary is: " + f.getSalary() + ".");

        System.out.println("The first employee's name is: " + g.getName() +
                ".  Their hire date is: " + g.getHireDate() + ".  Their address "
                + "is: " + g.getAddress() + ".  Their date of birth is: " +
                g.getDateOfBirth() + ".  Their Social Security Number is: " +
                g.getSSN() + ".  Their phone number is: " + g.getPhoneNum() +
                ".  Their hourly wage is: " + g.getHourlyWage() + ".  Their"
                + " hours worked is: " + g.getHoursWorked()+ ".  Their total"
                + " pay is: " + g.getPayTotal() + ".");

        System.out.println("The first employee's name is: " + h.getName() +
                ".  Their hire date is: " + h.getHireDate() + ".  Their address "
                + "is: " + h.getAddress() + ".  Their date of birth is: " +
                h.getDateOfBirth() + ".  Their Social Security Number is: " +
                h.getSSN() + ".  Their phone number is: " + h.getPhoneNum() +
                ".  Their salary is: " + h.getSalary() + ".  Their commision "
                + "percentage is: " + h.getCommisionPercentage() +" .  Their"
                + " total commisionable sales is: " + h.getCommisionedSalesAmount() +
                ".  Their total pay is: " + h.getCommisionTotal());
    }
}
