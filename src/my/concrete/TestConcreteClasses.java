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
public class TestConcreteClasses {
    
        public static void main(String[] args) {

            //Create Scanner variable to user input

            Scanner keyboard = new Scanner(System.in);

            //Create properties for employee information

            String name, hireDate, address, dateOfBirth, SSN, phoneNum;
            double salary, hourlyWage, hoursWorked, totalPay, commisionPercentage,
                    commisionedSalesTotal;
//
//        /* This section creates and tests the create of 2 different Employee objects
//        * First, get user input for the employees to be created, then 2 new Employees 
//        * are created, then get methods will be called to retrieve the information
//        */
//
//            System.out.println("Enter the employee's name, first and last.");
//            name = keyboard.nextLine();
//
//            System.out.println("Enter in the employee's hire date.");
//            hireDate = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's address.");
//            address = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's date of birth.");
//            dateOfBirth = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's Social Security Number.");
//            SSN = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's phone number.");
//            phoneNum = keyboard.nextLine();
//            
//            Employee a = new Employee(name, hireDate, address, dateOfBirth, SSN,
//                    phoneNum);
//            
//            System.out.println("Enter the employee's name, first and last.");
//            name = keyboard.nextLine();
//
//            System.out.println("Enter in the employee's hire date.");
//            hireDate = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's address.");
//            address = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's date of birth.");
//            dateOfBirth = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's Social Security Number.");
//            SSN = keyboard.nextLine();
//            
//            System.out.println("Enter in the employee's phone number.");
//            phoneNum = keyboard.nextLine();
//            
//            Employee b = new Employee(name, hireDate, address, dateOfBirth, SSN,
//                    phoneNum);
//            
//            // Test the input to verify proper operation
//            
//            System.out.println("The first employee's name is: " + a.getName() +
//                    ".  Their hire date is: " + a.getHireDate() + ".  Their address "
//                    + "is: " + a.getAddress() + ".  Their date of birth is: " +
//                    a.getDateOfBirth() + ".  Their Social Security Number is: " +
//                    a.getSSN() + ".  Their phone number is: " + a.getPhoneNum() +
//                    ".");
//            
//            System.out.println("The second employee's name is: " + b.getName() +
//                    ".  Their hire date is: " + b.getHireDate() + ".  Their address "
//                    + "is: " + b.getAddress() + ".  Their date of birth is: " +
//                    b.getDateOfBirth() + ".  Their Social Security Number is: " +
//                    b.getSSN() + ".  Their phone number is: " + b.getPhoneNum() +
//                    ".");
            
            /* This section tests the creation of a salaried and hourly employee 
            * class object
            */
            
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
            
            System.out.println("Enter in the employee's salary.");
            salary = Double.parseDouble(keyboard.nextLine());
            
            SalariedEmployee c = new SalariedEmployee(name, hireDate, address,
                    dateOfBirth, SSN, phoneNum, salary);
            
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
            
            HourlyEmployee d = new HourlyEmployee(name, hireDate, address, 
                dateOfBirth, SSN, phoneNum);
            
            d.setHourlyWage(hourlyWage);
            d.setHoursWorked(hoursWorked);
            
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
                    ".  Theirs hourly wage is: " + d.getHourlyWage() + ".  Their"
                    + " hours worked is: " + d.getHoursWorked()+ ".  Their total"
                    + " pay is: " + d.getPayTotal() + ".");
    }
}    
