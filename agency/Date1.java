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
public class Date1 {

    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;

    public Date1(String year, String month, String day, String hour, String minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }

    public String getClock() {
        return hour + ":" + minute;
    }

}
