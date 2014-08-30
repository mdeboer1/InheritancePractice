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
    private String name, address, dateOfBirth, SSN, phoneNum;
    
    //Constructor for Employee
    
    public Employee (String name, String address, String dateOfBirth, 
            String SSN, String phoneNum){
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
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
    
    public String getSSN() {
        return SSN;
    }

    // Sets employee social security number
    
    public void setSSN(String SSN) {
        this.SSN = SSN;
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
