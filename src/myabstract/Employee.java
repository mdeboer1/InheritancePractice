/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author mdeboer1
 */
public abstract class Employee {
    
    // String variables used to hold employees biographical information
    private String fName, lName, address, dateOfBirth, ssn, phoneNum;
    
    //Constructor for Employee
    
    public Employee (String fName, String address, String dateOfBirth, 
            String ssn, String phoneNum){
        this.fName = fName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
    }
    
    // Returns employee name
    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    //abstract to allow nulls in last name
    
    public abstract void setLastName(String lName);
    
    // Gets employee hire date, to be create in subclass
    
    public abstract String getHireDate();
    
    // Sets employee hire date, to be created in subclass
    
    public abstract void setHireDate(String hireDate);
            
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
    
    public void setSsn(String SSN) {
        this.ssn = SSN;
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
