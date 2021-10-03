/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import travel.agency.*;


public class CustomerData {
   public static Customer logInCustomer;
    private CustomerData(){
    }
  private static CustomerData customerData=new CustomerData();
    public static CustomerData GetIntance(){
        return customerData;
    }
    private ArrayList<Customer> CustomerList=new ArrayList();
    public ArrayList GetCustomerList(){
        return CustomerList;
    }
    public void addCustomer(String natinalcode,String firstname,String lastname,String username,String password){
        Customer customer=new Customer(natinalcode, firstname, lastname, username, password);
        CustomerList.add(customer);
    }
    public Customer searchCustomer(String username,String password){
        for(Customer customer:CustomerList){
           if(customer.getUserName().equals(username)){
               if(customer.getPassword().equals(password)){
                   logInCustomer=customer;
                   return customer;
               }
           }
                }
        return null;
    }
}
