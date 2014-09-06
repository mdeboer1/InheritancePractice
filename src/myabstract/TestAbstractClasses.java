/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;
import java.util.Scanner;
/**
 *
 * @author mdeboer1
 */
public class TestAbstractClasses {
    
    public static void main (String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        String fName, lName, hireDate, address, dateOfBirth, SSN, phoneNum;
        double salary, hourlyWage, hoursWorked, commisionPercentage,
                commisionedSalesTotal;
        
        System.out.println("Enter the employee's name, first and last.");
        fName = keyboard.nextLine();

        System.out.println("Enter the employee's name, first and last.");
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
        
        // Creates abstract package SalariedEmployee
        SalariedEmployee i = new SalariedEmployee(fName, lName, 
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        // Creates abstract package HourlyEmployee
        HourlyEmployee j = new HourlyEmployee(fName, hireDate, address, dateOfBirth, SSN, phoneNum);
        
        j.setHourlyWage(hourlyWage);
        j.setHoursWorked(hoursWorked);
        
        // Creates abstract package SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee k = new SalaryPlusCommisionEmployee(fName, lName,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        k.setCommisionPercentage(commisionPercentage);
        k.setCommisionedSalesAmount(commisionedSalesTotal);
        
        i.toString();
        j.toString();
        k.toString();
    }
}
