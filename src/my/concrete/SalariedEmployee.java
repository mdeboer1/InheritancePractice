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
    private double salary;

    public SalariedEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String SSN, String phoneNum) {
        
        super(name, hireDate, address, dateOfBirth, SSN, phoneNum);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
