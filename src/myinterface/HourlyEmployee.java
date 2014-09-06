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
    private String fName, lName, hireDate, address, dateOfBirth, ssn, phoneNum;
    // Doubles for hourly employee wage information
    private double hourlyWage, hoursWorked, totalPay;
    //Constructor for Employee
    
    public HourlyEmployee (String fName, String lName, String hireDate, String address, 
            String dateOfBirth, String ssn, String phoneNum){
        this.fName = fName;
        this.lName = lName;
        this.hireDate = hireDate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
    }

    // Returns employee name
    
    @Override
    public String getFirstName() {
        return fName;
    }
    
    
    // Sets employee name
    
    @Override
    public void setLastName(String lName) {
        if (lName == null){
            this.lName = " ";
        }
        else {
            this.lName = lName;
        }
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
    public String getSsn() {
        return ssn;
    }

    // Sets employee social security number
    
    @Override
    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    @Override
    public void setFirstName(String fName) {
        this.fName = fName;
    }

    @Override
    public String getLastName() {
        return lName;
    }
    
    @Override
    public String toString(){
        String response = "The first employee's name is: " + this.getFirstName() +
                " " + this.getLastName() + ".  Their hire date is: " + this.getHireDate() + 
                ".  Their address is: " + this.getAddress() + ".  Their date of birth is: " +
                this.getDateOfBirth() + ".  Their Social Security Number is: " +
                this.getSsn() + ".  Their phone number is: " + this.getPhoneNum() +
                ".  Their hourly wage is: " + this.getHourlyWage() + ".  Their"
                + " hours worked is: " + this.getHoursWorked()+ ".  Their total"
                + " pay is: " + this.getPayTotal() + ".";
        return response;
    }
}
