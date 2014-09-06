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
    
    public abstract void setFirstName(String fName);
    public abstract void setLastName(String lName);
    public abstract void setHireDate(String hireDate);
    public abstract void setAddress(String address);
    public abstract void setDateOfBirth(String dateOfBirth);
    public abstract void setSsn(String SSN);
    public abstract void setPhoneNum(String phoneNum);
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getHireDate();
    public abstract String getAddress();
    public abstract String getDateOfBirth();
    public abstract String getSsn();
    public abstract String getPhoneNum();
    
}
