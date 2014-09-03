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
        
        // Creates abstract package SalariedEmployee
        SalariedEmployee i = new SalariedEmployee(name, 
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        // Creates abstract package HourlyEmployee
        HourlyEmployee j = new HourlyEmployee(name, 
                hireDate, address, dateOfBirth, SSN, phoneNum);
        
        j.setHourlyWage(hourlyWage);
        j.setHoursWorked(hoursWorked);
        
        // Creates abstract package SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee k = new SalaryPlusCommisionEmployee(name,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        k.setCommisionPercentage(commisionPercentage);
        k.setCommisionedSalesAmount(commisionedSalesTotal);
        
        System.out.println("The first employee's name is: " + i.getName() +
            ".  Their hire date is: " + i.getHireDate() + ".  Their address "
            + "is: " + i.getAddress() + ".  Their date of birth is: " +
            i.getDateOfBirth() + ".  Their Social Security Number is: " +
            i.getSSN() + ".  Their phone number is: " + i.getPhoneNum() +
            ".  Their salary is: " + i.getSalary() + ".");  
        
        System.out.println("The first employee's name is: " + j.getName() +
                ".  Their hire date is: " + j.getHireDate() + ".  Their address "
                + "is: " + j.getAddress() + ".  Their date of birth is: " +
                j.getDateOfBirth() + ".  Their Social Security Number is: " +
                j.getSSN() + ".  Their phone number is: " + j.getPhoneNum() +
                ".  Their hourly wage is: " + j.getHourlyWage() + ".  Their"
                + " hours worked is: " + j.getHoursWorked()+ ".  Their total"
                + " pay is: " + j.getPayTotal() + ".");
        
        System.out.println("The first employee's name is: " + k.getName() +
                ".  Their hire date is: " + k.getHireDate() + ".  Their address "
                + "is: " + k.getAddress() + ".  Their date of birth is: " +
                k.getDateOfBirth() + ".  Their Social Security Number is: " +
                k.getSSN() + ".  Their phone number is: " + k.getPhoneNum() +
                ".  Their salary is: " + k.getSalary() + ".  Their commision "
                + "percentage is: " + k.getCommisionPercentage() +" .  Their"
                + " total commisionable sales is: " + k.getCommisionedSalesAmount() +
                ".  Their total pay is: " + k.getCommisionTotal());
    }
}
