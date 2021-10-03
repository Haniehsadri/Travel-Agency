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
public class Message {
    public int code;
    private String subject;
    private String text;
    private Customer writer;
    private String reply="هنوز پاسخی دریافت نشده است";
    public  boolean read=false;
    public String shenas;
    public String shenas2;
    public Message(Customer writer,String subject, String text) {
      
        if(!subject.equals("")){
        this.subject = subject;
        this.text = text;
        this.writer=writer;
        }
        else{
            this.subject="no subject";
            this.text=text;
            this.writer=writer;
        }
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Customer getWriter() {
        return writer;
    }
    
}
