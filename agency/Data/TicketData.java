/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import travel.agency.Ticket;

/**
 *
 * @author sony
 */
public class TicketData {
    public static int tekrari;
    private TicketData() {
    }
    private static TicketData ticketData=new TicketData();
    public static TicketData getInstance(){
        return ticketData;
    }
    private ArrayList<Ticket> ticketList=new ArrayList();
    public ArrayList<Ticket> getTickList(){
        return ticketList;
    }
    public void addTicket(Ticket ticket){
          tekrari=0;
        for(Ticket ticket2:ticketList){
            if(ticket2.getFlight().getCode().equals(ticket.getFlight().getCode())&&ticket2.getCustomer().getNationalCode().equals(ticket.getCustomer().getNationalCode())){
                tekrari=1;
                JOptionPane.showMessageDialog(null,"این بلیت قبلا ثبت شده است");
            }
        }
        if(tekrari==0){
        ticketList.add(ticket);
        ticket.getCustomer().numberOfBuy++;
        }
        
    }
}
