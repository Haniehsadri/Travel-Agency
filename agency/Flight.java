  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.agency;

import java.util.Date;

public class Flight {
    public  int ticketCount=0;
    private String Code;
    private String Company;
    private String Source;
    private String destination;
    private Date1 date;
    private String shenas;
    public String capacity;
    public Flight(String Code, String Company, String Source, String destination, Date1 date,String capacity) {
        this.Code = Code;
        this.Company = Company;
        this.Source = Source;
        this.destination = destination;
        this.date = date;
        this.shenas=Code+"     "+Company+"     "+date.toString()+"     "+date.getClock();
        this.capacity=capacity;
    }

    public String getShenas() {
        return shenas;
    }

    public String getCode() {
        return Code;
    }

    public String getCompany() {
        return Company;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return destination;
    }

    public Date1 getDate() {
        return date;
    }
}
