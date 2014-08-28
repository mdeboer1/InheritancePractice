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
public class HourlyEmployee extends Employee {
    
    private double hourlyWage, hoursWorked;
        
    public HourlyEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String SSN, String phoneNum) {
        
        super(name, hireDate, address, dateOfBirth, SSN, phoneNum);
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayTotal() {
        return hoursWorked * hourlyWage;
    }
}
