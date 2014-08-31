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
public class SalaryPlusCommisionEmployee extends SalariedEmployee {
    /*create double properties for percentage of commision, commisionable sales 
    *amount and salary
    */
    private double commisionPercentage, commisionedSalesAmount, salary;
    /*constructor for commisioned employee, calls super constructor, sends
    all information to SalariedEmployee
    */
    
    public SalaryPlusCommisionEmployee(String name, String hireDate, 
            String address, String dateOfBirth, String SSN, String phoneNum, 
            double salary) {
        
        super(name, hireDate, address, dateOfBirth, SSN, phoneNum, salary);
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
        this.salary = super.getSalary();
        return commisionedSalesAmount * (commisionPercentage / 100) + salary;
    }
}
