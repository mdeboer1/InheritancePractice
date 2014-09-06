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

        String fName, lName, hireDate, address, dateOfBirth, SSN, phoneNum;
        double salary, hourlyWage, hoursWorked, commisionPercentage,
                commisionedSalesTotal;
        
        System.out.println("Enter the employee's first name, first and last.");
        fName = keyboard.nextLine();
        
        System.out.println("Enter the employee's second name, first and last.");
        lName = keyboard.nextLine();

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
        SalariedEmployee f = new SalariedEmployee(fName, lName, hireDate, address,
            dateOfBirth, SSN, phoneNum, salary);

        // Creates interface package HourlyEmployee
        HourlyEmployee g = new HourlyEmployee(fName, lName, 
                hireDate, address, dateOfBirth, SSN, phoneNum);
        
        g.setHourlyWage(hourlyWage);
        g.setHoursWorked(hoursWorked);
        
        // Creates interface package SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee h = new SalaryPlusCommisionEmployee(fName, lName,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        h.setCommisionPercentage(commisionPercentage);
        h.setCommisionedSalesAmount(commisionedSalesTotal);

        f.toString();
        g.toString();        
        h.toString();
    }
}
