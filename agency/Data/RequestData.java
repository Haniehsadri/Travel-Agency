/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.security.jca.GetInstance;
import travel.agency.Request;
import travel.agency.Staff;

/**
 *
 * @author sony
 */
public class RequestData {

   private RequestData() {
    }
    public static RequestData instance=new RequestData();
    public static RequestData Getinstance(){
        return instance;
    }
    private ArrayList<Request> requestList=new ArrayList();

    public ArrayList<Request> getRequestList() {
        return requestList;
    }
    public void addRequest(Request request){
          int tekrari=0;
        for(Request request1:requestList){
            if(request1.sender.getNationalCode().equals(request.sender.getNationalCode())){
                tekrari=1;
                JOptionPane.showMessageDialog(null,"شما قبلا درخواست فرستاده اید");
            }
        }
        if(tekrari==0){
        requestList.add(request);
         JOptionPane.showMessageDialog(null,"درخواست ارسال شد");
        }
    }
    public Request searchRequest(String userName){
        for(Request request:requestList){
            if(request.sender.getUserName().equals(userName))
                return request;
        }
        return null;
    }
}
