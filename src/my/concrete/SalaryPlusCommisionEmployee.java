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
    
    private double commisionPercentage, commisionedSalesAmount;
    
    public SalaryPlusCommisionEmployee(String name, String hireDate, String address, String dateOfBirth, String SSN, String phoneNum) {
        super(name, hireDate, address, dateOfBirth, SSN, phoneNum);
    }

    public double getCommisionPercentage() {
        return commisionPercentage;
    }

    public void setCommisionPercentage(double commisionPercentage) {
        this.commisionPercentage = commisionPercentage;
    }

    public double getCommisionedSalesAmount() {
        return commisionedSalesAmount;
    }

    public void setCommisionedSalesAmount(double commisionedSalesAmount) {
        this.commisionedSalesAmount = commisionedSalesAmount;
    }

    public double getCommisionTotal() {
        return commisionedSalesAmount * commisionPercentage;
    }
}
