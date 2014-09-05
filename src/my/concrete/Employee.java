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
    private String name, hireDate, address, dateOfBirth, ssn, phoneNum;
    
    //Constructor for Employee
    
    public Employee (String name, String hireDate, String address, String dateOfBirth, 
            String ssn, String phoneNum){
        this.name = name;
        this.hireDate = hireDate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
    }

    // Returns employee name
    
    public String getName() {
        return name;
    }
    
    // Sets employee name
    
    public void setName(String name) {
        this.name = name;
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
}
