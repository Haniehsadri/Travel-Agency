/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import travel.agency.Flight;

/**
 *
 * @author sony
 */
public class FlightData {

    private FlightData() {
    }
      private static FlightData flightData=new FlightData();
    public static FlightData GetIntance(){
        return flightData;
    }
    private ArrayList<Flight> FlightList=new ArrayList();
    public ArrayList<Flight> GetFlightList(){
        return FlightList;
    }
    public void addFlight(Flight flight){
        int tekrari=0;
        for(Flight flight2:FlightList){
            if(flight2.getCode().equals(flight.getCode())){
                tekrari=1;
                JOptionPane.showMessageDialog(null,"این پرواز قبلا ثبت شده است");
            }
        }
        if(tekrari==0)
        FlightList.add(flight);
    }
    public Flight searchFlight(String shenas){
        for(Flight flight:FlightList){
            if(flight.getShenas().equals(shenas))
                return flight;
        }
        return null;
    }
}
