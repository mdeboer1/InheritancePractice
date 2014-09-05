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
    
    public SalariedEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String ssn, String phoneNum, double salary) {
        
        super(name, hireDate, address, dateOfBirth, ssn, phoneNum);
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
}
