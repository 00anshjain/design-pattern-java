package com.designpattern.facadedesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeDesignPatternApplication {

	public static void main(String[] args) {
		System.out.println("----------Without Facade--------");
		User user = new User("Ansh Jain", "anshjain@example.com", "+91-9876543210");
		TicketSystem ts = new TicketSystem();
		PaymentSystem ps = new PaymentSystem();
		NotificationSystem ns = new NotificationSystem();
		if(ts.validateAvailablity()) {
			String ticketNumber = ts.createTicket(user);
			ps.chargeCard(user);
			ns.sendEmail(user, ticketNumber);
			ns.sendSms(user, ticketNumber);
		}
		System.out.println("-----------------------------");
		System.out.println("With use for Facade Design Pattern, client code should not interact with these many classes. \nIt will only call the method of Facade class, it will implement the similar functionality");
		BookingFacade bookingFacade = new BookingFacade();
		bookingFacade.createBooking(user);

		SpringApplication.run(FacadeDesignPatternApplication.class, args);
	}

}
