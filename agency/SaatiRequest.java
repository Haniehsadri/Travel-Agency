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
public class SaatiRequest extends Request{
   private String date;
  private String time1;
   private String time2;

    public SaatiRequest(Staff sender, String date, String time1, String time2) {
        this.sender = sender;
        this.date = date;
        this.time1 = time1;
        this.time2 = time2;
    }

    public String getDate() {
        return date;
    }

    public String getTime1() {
        return time1;
    }

    public String getTime2() {
        return time2;
    }
    
}
