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
public class SalariedEmployee extends Employee {
    
    // Double for employee salary
    
    private double salary;

    // Constructor, calls Employee constructor, sets salary
    
    public SalariedEmployee(String fName, String lName, String hireDate, String address, 
            String dateOfBirth, String ssn, String phoneNum, double salary) {
        
        super(fName, lName, hireDate, address, dateOfBirth, ssn, phoneNum);
        this.salary = salary;
    }

    //returns employee salary
    
    public double getSalary() {
        return salary;
    }

    //sets employee salary
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        String response = "The first employee's name is: " + this.getFirstName() +
                " " + this.getLastName() + ".  Their hire date is: " + this.getHireDate() + 
                ".  Their address " + "is: " + this.getAddress() + ".  Their date of "
                + "birth is: " + this.getDateOfBirth() + ".  Their Social Security"
                + " Number is: " + this.getSsn() + ".  Their phone number is: " + 
                this.getPhoneNum() + ".  Their salary is: " + this.getSalary() + ".";
        return response;
    }
}
