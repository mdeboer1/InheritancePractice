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
    
    // Doubles for hourly employee wage information
    
    private double hourlyWage, hoursWorked, totalPay;
     
    //construtor, calls SalariedEmployee constructor
    
    public HourlyEmployee(String name, String hireDate, String address, 
            String dateOfBirth, String SSN, String phoneNum) {
        
        super(name, hireDate, address, dateOfBirth, SSN, phoneNum);
    }

    // Returns hourly wage
    
    public double getHourlyWage() {
        return hourlyWage;
    }

    // Sets hourly wage
    
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    // Returns hours worked
    
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Sets hours worked
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Returns total pay
    
    public double getPayTotal() {
        totalPay = hoursWorked * hourlyWage;
        return totalPay;
    }
}
