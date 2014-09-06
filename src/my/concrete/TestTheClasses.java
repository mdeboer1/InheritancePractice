/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;
import java.util.Scanner;

/**
 *
 * @author mdeboer1
 * 
 * This class tests the my.concrete package classes and inheritance
 */
public class TestTheClasses {
    
    public static void main(String[] args) {

        //Create Scanner variable to user input

        Scanner keyboard = new Scanner(System.in);

        //Create properties for employee information

        String fName, lName, hireDate, address, dateOfBirth, SSN, phoneNum;
        double salary, hourlyWage, hoursWorked, commisionPercentage,
                commisionedSalesTotal;
        
        System.out.println("Enter the employee's first name, first and last.");
        fName = keyboard.nextLine();
        
        System.out.println("Enter the employee's last name, first and last.");
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
        
        // Next two objects are to test Employee concrete class
        Employee a = new Employee(fName, lName, hireDate, address, dateOfBirth, SSN,
                    phoneNum);
        
        Employee b = new Employee(fName, lName, hireDate, address, dateOfBirth, SSN,
                   phoneNum);
        
        // Creates concrete package SalariedEmployee 
        SalariedEmployee c = new SalariedEmployee(fName, lName, hireDate, address,
                    dateOfBirth, SSN, phoneNum, salary);
        
        // Creates concrete package HourlyEmployee
        HourlyEmployee d = new HourlyEmployee(fName, lName, hireDate, address, 
                dateOfBirth, SSN, phoneNum);
        
        d.setHourlyWage(hourlyWage);
        d.setHoursWorked(hoursWorked);
        
        // Creates concrete pacakage SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee e = new SalaryPlusCommisionEmployee(fName, lName,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        e.setCommisionPercentage(commisionPercentage);
        e.setCommisionedSalesAmount(commisionedSalesTotal);
        
        a.toString();
        b.toString();
        c.toString();
        d.toString();
        e.toString();

    }
}    
