/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author mdeboer1
 */
public interface Employee {
    
    public abstract void setName(String name);
    public abstract void setHireDate(String hireDate);
    public abstract void setAddress(String address);
    public abstract void setDateOfBirth(String dateOfBirth);
    public abstract void setSSN(String SSN);
    public abstract void setPhoneNum(String phoneNum);
    public abstract String getName();
    public abstract String getHireDate();
    public abstract String getAddress();
    public abstract String getDateOfBirth();
    public abstract String getSSN();
    public abstract String getPhoneNum();
    
}
