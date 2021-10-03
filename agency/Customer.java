/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.agency;

/**
 *
 * @author sony
 */
public class Customer {

    private String NationalCode;
    private String FirstName;
    private String LastName;
    private String UserName;
    private String Password;
    public int numberOfBuy=0;

    public Customer(String NationalCode, String FirstName, String LastName, String UserName, String Password) {
        this.NationalCode = NationalCode;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getNationalCode() {
        return NationalCode;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    
    
}
