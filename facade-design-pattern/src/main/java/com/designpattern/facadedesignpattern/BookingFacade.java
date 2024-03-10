package com.designpattern.facadedesignpattern;

public class BookingFacade {
    public void createBooking(User user) {
        TicketSystem ts = new TicketSystem();
        PaymentSystem ps = new PaymentSystem();
        NotificationSystem ns = new NotificationSystem();
        if(ts.validateAvailablity()) {
            String ticketNumber = ts.createTicket(user);
            ps.chargeCard(user);
            ns.sendEmail(user, ticketNumber);
            ns.sendSms(user, ticketNumber);
        }
    }
}
