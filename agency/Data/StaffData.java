/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import travel.agency.Staff;

/**
 *
 * @author sony
 */
public class StaffData {
   private static StaffData instance=new StaffData();

    private StaffData() {
    }
    
    public static StaffData getInstance() {
        return instance;
    }
    private ArrayList<Staff> staffList=new ArrayList<Staff>();

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    public void addStaff(Staff staff){
         int tekrari=0;
        for(Staff staff1:staffList){
            if(staff1.getNationalCode().equals(staff.getNationalCode())){
                tekrari=1;
                JOptionPane.showMessageDialog(null,"این کارمند قبلا ثبت شده است");
            }
        }
        if(tekrari==0){
        staffList.add(staff);
         JOptionPane.showMessageDialog(null,"کارمند جدید ثبت شد");
        }
    }
    public Staff staffLogIn(String username,String password){
        for(Staff staff:staffList){
            if(staff.getUserName().equals(username)){
                if(staff.getPassWord().equals(password))
                    return staff;
            }
        }
        return null;
    }
    public ArrayList<Staff> staffHasRequest(){
        ArrayList<Staff> staffs=new ArrayList<>();
        for(Staff staff:staffList){
            if(staff.hasRequest){
                staffs.add(staff);
            }
        }
        return staffs;
    }
}
