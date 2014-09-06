/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author mdeboer1
 */
public class Employee {
    
    // String variables used to hold employees biographical information
    private String fName, lName, hireDate, address, dateOfBirth, ssn, phoneNum;
    
    //Constructor for Employee
    
    public Employee (String fName, String lName, String hireDate, String address, String dateOfBirth, 
            String ssn, String phoneNum){
        this.fName = fName;
        this.lName = lName;
        this.hireDate = hireDate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
    }

    // Returns employee name
    
    public String getFirstName() {
        return fName;
    }
    
    // Sets employee name
    
    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }
    
    // Gets employee hire date
    
    public String getHireDate() {
        return hireDate;
    }
    
    // Sets employee hire date
    
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Gets employee address
    
    public String getAddress() {
        return address;
    }

    // Sets Employee Address
    
    public void setAddress(String address) {
        this.address = address;
    }

    // Gets employee date of birth
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Sets employee date of birth
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Gets employee social security number
    
    public String getSsn() {
        return ssn;
    }

    // Sets employee social security number
    
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    // Gets employee phone number
    
    public String getPhoneNum() {
        return phoneNum;
    }

    // Sets Employee phone number
    
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    @Override
    public String toString(){
        String response = "The first employee's name is: " + this.getFirstName() +
                " " + this.getLastName() + ".  Their hire date is: " + this.getHireDate() +
                ".  Their address " + "is: " + this.getAddress() + ".  Their date of "
                + "birth is: " + this.getDateOfBirth() + ".  Their Social Security "
                + "Number is: " + this.getSsn() + ".  Their phone number is: " + 
                this.getPhoneNum() + ".";
        return response;
    }
    
}
