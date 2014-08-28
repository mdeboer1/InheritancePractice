/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author mdeboer1
 */
public class SalariedEmployee implements Employee {
    
    // String variables used to hold employees biographical information
    private String name, hireDate, address, dateOfBirth, SSN, phoneNum;
    // Double for employee salary
    private double salary;
    
    //constructor for SalariedEmployee
    
    public SalariedEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String SSN, String phoneNum, double salary){
        
        this.name = name;
        this.hireDate = hireDate;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
        this.phoneNum = phoneNum;
        this.salary = salary;
        
    }
    
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
    
    //returns employee salary
    
    public double getSalary() {
        return salary;
    }

    //sets employee salary
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
