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
public class SalaryPlusCommisionEmployee extends SalariedEmployee {
    
    /*create double properties for percentage of commision, commisionable sales 
    *amount and salary
    */
    private double commisionPercentage, commisionedSalesAmount;
    
    /*constructor for commisioned employee, calls super constructor, sends
    all information to SalariedEmployee
    */
    
    public SalaryPlusCommisionEmployee(String fName, String lName, String hireDate, String address, 
            String dateOfBirth, String ssn, String phoneNum, double salary) {
        
        super(fName, lName, hireDate, address, dateOfBirth, ssn, phoneNum, salary);
    }
    
    //returns commision percentage
    
    public double getCommisionPercentage() {
        return commisionPercentage;
    }
    
    //sets commision percentage
    
    public void setCommisionPercentage(double commisionPercentage) {
        this.commisionPercentage = commisionPercentage;
    }
    
    //returns commisioned sales amount
    
    public double getCommisionedSalesAmount() {
        return commisionedSalesAmount;
    }
    
    //sets commisioned sales total (could be monthly, weekly, bi-weekly
    
    public void setCommisionedSalesAmount(double commisionedSalesAmount) {
        this.commisionedSalesAmount = commisionedSalesAmount;
    }
    
    /*returns total of salary and commision, salary information retrieve through
    call to super.getSalary method
    */
    
    public double getCommisionTotal() {
         return commisionedSalesAmount * (commisionPercentage / 100) + super.getSalary();
    }
    
    @Override
    public String toString(){
        String response = "The first employee's name is: " + this.getFirstName() +
                " " +this.getLastName() + ".  Their hire date is: " + this.getHireDate() + 
                ".  Their address " + "is: " + this.getAddress() + ".  Their date "
                + "of birth is: " + this.getDateOfBirth() + ".  Their Social Security"
                + " Number is: " + this.getSsn() + ".  Their phone number is: " + 
                this.getPhoneNum() + ".  Their salary is: " + this.getSalary() +
                ".  Their commision " + "percentage is: " + this.getCommisionPercentage() +
                " .  Their total commisionable sales is: " + this.getCommisionedSalesAmount() +
                ".  Their total pay is: " + this.getCommisionTotal();
        return response;
    }
}
