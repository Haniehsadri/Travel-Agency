/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import travel.agency.Message;

/**
 *
 * @author sony
 */
public class MessageData {
   public static int code=100;
    private MessageData() {
    }
    private static MessageData Instance=new MessageData();

    public static MessageData getInstance() {
        return Instance;
    }
    private ArrayList<Message> messegeList=new ArrayList<Message>();

    public ArrayList<Message> getMessegeList() {
        return messegeList;
    }
    public  void addMessege(Message message ){
        if(message!=null){
            message.code=code++;
            message.shenas=message.getWriter().getUserName()+"     "+message.getSubject()+"     "+String.valueOf(message.code);
        message.shenas2=message.getSubject()+"     "+String.valueOf(message.code);
        messegeList.add(message);
        }
    }
     public int getUnReadMessagesNumber(){
        int counter=0;
        for(Message message:messegeList){
            if(!message.read)
                counter++;
        }
        return counter;
    }
     public ArrayList<Message> getUnReadMessages(){
         ArrayList<Message> unReadMessages=new ArrayList<>();
         for(Message message:messegeList){
            if(!message.read){
                unReadMessages.add(message);
            }
                
        }
         return unReadMessages;
     }
}
