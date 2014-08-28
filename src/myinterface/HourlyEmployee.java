/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author mdeboer
 */
public class HourlyEmployee implements Employee {
    // String variables used to hold employees biographical information
    private String name, hireDate, address, dateOfBirth, SSN, phoneNum;
    // Doubles for hourly employee wage information
    private double hourlyWage, hoursWorked, totalPay;
    //Constructor for Employee
    
    public HourlyEmployee (String name, String hireDate, String address, String dateOfBirth, 
            String SSN, String phoneNum){
        this.name = name;
        this.hireDate = hireDate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
        this.phoneNum = phoneNum;
    }

    // Returns employee name
    
    @Override
    public String getName() {
        return name;
    }
    
    // Sets employee name
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Gets employee hire date
    
    @Override
    public String getHireDate() {
        return hireDate;
    }
    
    // Sets employee hire date
    
    @Override
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Gets employee address
    
    @Override
    public String getAddress() {
        return address;
    }

    // Sets Employee Address
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // Gets employee date of birth
    
    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Sets employee date of birth
    
    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Gets employee social security number
    
    @Override
    public String getSSN() {
        return SSN;
    }

    // Sets employee social security number
    
    @Override
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    // Gets employee phone number
    
    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    // Sets Employee phone number
    
    @Override
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    // Returns hourly wage
    
    public double getHourlyWage() {
        return hourlyWage;
    }

    // Sets hourly wage
    
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    // Returns hours worked
    
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Sets hours worked
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Returns total pay
    
    public double getPayTotal() {
        totalPay = hoursWorked * hourlyWage;
        return totalPay;
    }
}
