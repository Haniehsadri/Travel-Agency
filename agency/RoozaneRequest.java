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
public class RoozaneRequest extends Request{
   private String date1;
   private String date2;

    public RoozaneRequest(Staff sender, String date1, String date2) {
        this.sender = sender;
        this.date1 = date1;
        this.date2 = date2;
    }

    public String getDate1() {
        return date1;
    }

    public String getDate2() {
        return date2;
    }
    
}
