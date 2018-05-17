package ua.j.service;

import java.util.List;

import ua.j.entity.Ticket;

public interface TicketService {
	
	void saveTicket(Ticket ticket);
	
	List<Ticket> findAllTickets();
	
	Ticket findTicketById(int id);
	
}
