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
public class SalariedEmployee extends Employee {
    // Double for employee salary
    
    private double salary;
    private String hireDate;

    // Constructor, calls Employee constructor, sets salary
    
    public SalariedEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String SSN, String phoneNum, double salary) {
        
        super(name, address, dateOfBirth, SSN, phoneNum);
        this.salary = salary;
        this.hireDate = hireDate;
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
    public String getHireDate() {
        return hireDate;
    }

    @Override
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
