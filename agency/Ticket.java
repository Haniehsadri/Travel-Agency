/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency;


    public class Ticket {
        private Flight flight;
        private Customer customer;

        public Flight getFlight() {
            return flight;
        }

        public Customer getCustomer() {
            return customer;
        }
 

    public Ticket(Flight flight,Customer customer) {
        this.flight = flight;
        this.customer = customer;
    }
    
}
