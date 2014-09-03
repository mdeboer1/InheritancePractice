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
        
        // Next two objects are to test Employee concrete class
        Employee a = new Employee(name, hireDate, address, dateOfBirth, SSN,
                    phoneNum);
        
        Employee b = new Employee(name, hireDate, address, dateOfBirth, SSN,
                   phoneNum);
        
        // Creates concrete package SalariedEmployee 
        SalariedEmployee c = new SalariedEmployee(name, hireDate, address,
                    dateOfBirth, SSN, phoneNum, salary);
        
        // Creates concrete package HourlyEmployee
        HourlyEmployee d = new HourlyEmployee(name, hireDate, address, 
                dateOfBirth, SSN, phoneNum);
        
        d.setHourlyWage(hourlyWage);
        d.setHoursWorked(hoursWorked);
        
        // Creates concrete pacakage SalaryPlusCommisionEmployee
        SalaryPlusCommisionEmployee e = new SalaryPlusCommisionEmployee(name,
                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
        
        e.setCommisionPercentage(commisionPercentage);
        e.setCommisionedSalesAmount(commisionedSalesTotal);
        
//        // Creates interface package SalariedEmployee
//        myinterface.SalariedEmployee f = new myinterface.SalariedEmployee(name, hireDate, address,
//            dateOfBirth, SSN, phoneNum, salary);
//
//        // Creates interface package HourlyEmployee
//        myinterface.HourlyEmployee g = new myinterface.HourlyEmployee(name, 
//                hireDate, address, dateOfBirth, SSN, phoneNum);
//        
//        g.setHourlyWage(hourlyWage);
//        g.setHoursWorked(hoursWorked);
//        
//        // Creates interface package SalaryPlusCommisionEmployee
//        myinterface.SalaryPlusCommisionEmployee h = new myinterface.SalaryPlusCommisionEmployee(name,
//                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
//        
//        h.setCommisionPercentage(commisionPercentage);
//        h.setCommisionedSalesAmount(commisionedSalesTotal);
        
        // Creates abstract package SalariedEmployee
//        myabstract.SalariedEmployee i = new myabstract.SalariedEmployee(name, 
//                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
//        
        // Creates abstract package HourlyEmployee
//        myabstract.HourlyEmployee j = new myabstract.HourlyEmployee(name, 
//                hireDate, address, dateOfBirth, SSN, phoneNum);
//        
//        j.setHourlyWage(hourlyWage);
//        j.setHoursWorked(hoursWorked);
//        
//        // Creates abstract package SalaryPlusCommisionEmployee
//        myabstract.SalaryPlusCommisionEmployee k = new myabstract.SalaryPlusCommisionEmployee(name,
//                hireDate, address, dateOfBirth, SSN, phoneNum, salary);
//        
//        k.setCommisionPercentage(commisionPercentage);
//        k.setCommisionedSalesAmount(commisionedSalesTotal);
        
        // Test the input to verify proper operation of objects
            
        System.out.println("The first employee's name is: " + a.getName() +
                ".  Their hire date is: " + a.getHireDate() + ".  Their address "
                + "is: " + a.getAddress() + ".  Their date of birth is: " +
                a.getDateOfBirth() + ".  Their Social Security Number is: " +
                a.getSSN() + ".  Their phone number is: " + a.getPhoneNum() +
                ".");

        System.out.println("The second employee's name is: " + b.getName() +
                ".  Their hire date is: " + b.getHireDate() + ".  Their address "
                + "is: " + b.getAddress() + ".  Their date of birth is: " +
                b.getDateOfBirth() + ".  Their Social Security Number is: " +
                b.getSSN() + ".  Their phone number is: " + b.getPhoneNum() +
                ".");

        System.out.println("The first employee's name is: " + c.getName() +
                ".  Their hire date is: " + c.getHireDate() + ".  Their address "
                + "is: " + c.getAddress() + ".  Their date of birth is: " +
                c.getDateOfBirth() + ".  Their Social Security Number is: " +
                c.getSSN() + ".  Their phone number is: " + c.getPhoneNum() +
                ".  Their salary is: " + c.getSalary() + ".");

        System.out.println("The first employee's name is: " + d.getName() +
                ".  Their hire date is: " + d.getHireDate() + ".  Their address "
                + "is: " + d.getAddress() + ".  Their date of birth is: " +
                d.getDateOfBirth() + ".  Their Social Security Number is: " +
                d.getSSN() + ".  Their phone number is: " + d.getPhoneNum() +
                ".  Their hourly wage is: " + d.getHourlyWage() + ".  Their"
                + " hours worked is: " + d.getHoursWorked()+ ".  Their total"
                + " pay is: " + d.getPayTotal() + ".");

        System.out.println("The first employee's name is: " + e.getName() +
                ".  Their hire date is: " + e.getHireDate() + ".  Their address "
                + "is: " + e.getAddress() + ".  Their date of birth is: " +
                e.getDateOfBirth() + ".  Their Social Security Number is: " +
                e.getSSN() + ".  Their phone number is: " + e.getPhoneNum() +
                ".  Their salary is: " + e.getSalary() + ".  Their commision "
                + "percentage is: " + e.getCommisionPercentage() +" .  Their"
                + " total commisionable sales is: " + e.getCommisionedSalesAmount() +
                ".  Their total pay is: " + e.getCommisionTotal());

//        System.out.println("The first employee's name is: " + f.getName() +
//                    ".  Their hire date is: " + f.getHireDate() + ".  Their address "
//                    + "is: " + f.getAddress() + ".  Their date of birth is: " +
//                    f.getDateOfBirth() + ".  Their Social Security Number is: " +
//                    f.getSSN() + ".  Their phone number is: " + f.getPhoneNum() +
//                    ".  Their salary is: " + f.getSalary() + ".");
//
//        System.out.println("The first employee's name is: " + g.getName() +
//                ".  Their hire date is: " + g.getHireDate() + ".  Their address "
//                + "is: " + g.getAddress() + ".  Their date of birth is: " +
//                g.getDateOfBirth() + ".  Their Social Security Number is: " +
//                g.getSSN() + ".  Their phone number is: " + g.getPhoneNum() +
//                ".  Their hourly wage is: " + g.getHourlyWage() + ".  Their"
//                + " hours worked is: " + g.getHoursWorked()+ ".  Their total"
//                + " pay is: " + g.getPayTotal() + ".");
//
//        System.out.println("The first employee's name is: " + h.getName() +
//                ".  Their hire date is: " + h.getHireDate() + ".  Their address "
//                + "is: " + h.getAddress() + ".  Their date of birth is: " +
//                h.getDateOfBirth() + ".  Their Social Security Number is: " +
//                h.getSSN() + ".  Their phone number is: " + h.getPhoneNum() +
//                ".  Their salary is: " + h.getSalary() + ".  Their commision "
//                + "percentage is: " + h.getCommisionPercentage() +" .  Their"
//                + " total commisionable sales is: " + h.getCommisionedSalesAmount() +
//                ".  Their total pay is: " + h.getCommisionTotal());
        
//        System.out.println("The first employee's name is: " + i.getName() +
//                ".  Their hire date is: " + i.getHireDate() + ".  Their address "
//                + "is: " + i.getAddress() + ".  Their date of birth is: " +
//                i.getDateOfBirth() + ".  Their Social Security Number is: " +
//                i.getSSN() + ".  Their phone number is: " + i.getPhoneNum() +
//                ".  Their salary is: " + i.getSalary() + ".");  
//        
//        System.out.println("The first employee's name is: " + j.getName() +
//                ".  Their hire date is: " + j.getHireDate() + ".  Their address "
//                + "is: " + j.getAddress() + ".  Their date of birth is: " +
//                j.getDateOfBirth() + ".  Their Social Security Number is: " +
//                j.getSSN() + ".  Their phone number is: " + j.getPhoneNum() +
//                ".  Their hourly wage is: " + j.getHourlyWage() + ".  Their"
//                + " hours worked is: " + j.getHoursWorked()+ ".  Their total"
//                + " pay is: " + j.getPayTotal() + ".");
//        
//        System.out.println("The first employee's name is: " + k.getName() +
//                ".  Their hire date is: " + k.getHireDate() + ".  Their address "
//                + "is: " + k.getAddress() + ".  Their date of birth is: " +
//                k.getDateOfBirth() + ".  Their Social Security Number is: " +
//                k.getSSN() + ".  Their phone number is: " + k.getPhoneNum() +
//                ".  Their salary is: " + k.getSalary() + ".  Their commision "
//                + "percentage is: " + k.getCommisionPercentage() +" .  Their"
//                + " total commisionable sales is: " + k.getCommisionedSalesAmount() +
//                ".  Their total pay is: " + k.getCommisionTotal());
    }
}    
