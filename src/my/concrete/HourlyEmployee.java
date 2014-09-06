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
    
    public HourlyEmployee(String fName, String lName, String hireDate, String address, 
            String dateOfBirth, String ssn, String phoneNum) {
        
        super(fName, lName, hireDate, address, dateOfBirth, ssn, phoneNum);
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
    
    @Override
    public String toString(){
        String response = "The first employee's name is: " + this.getFirstName() +
                " " + this.getLastName() + ".  Their hire date is: " + this.getHireDate() 
                + ".  Their address " + "is: " + this.getAddress() + ".  Their date "
                + "of birth is: " + this.getDateOfBirth() + ".  Their Social "
                + "Security Number is: " + this.getSsn() + ".  Their phone number is: "
                + this.getPhoneNum() + ".  Their hourly wage is: " + this.getHourlyWage() 
                + ".  Their hours worked is: " + this.getHoursWorked()+ ".  Their total"
                + " pay is: " + this.getPayTotal() + ".";
        return response;
    }
}
