package com.designpattern.facadedesignpattern;

public class TicketSystem {
    Boolean validateAvailablity() {
        return true;
    }
    public String createTicket(User user) {
        System.out.println("Ticket created for user: " + user.getName() + ", emailId: " + user.getEmail());
        return "123456";
    }
}
