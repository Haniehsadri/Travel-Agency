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
public class Staff {
    private String nationalCode;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    public boolean hasRequest=false;
    public Staff( String nationalCode, String firstName, String lastName, String userName, String passWord) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
     
  
}
