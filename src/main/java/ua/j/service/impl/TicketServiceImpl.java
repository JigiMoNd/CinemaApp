package ua.j.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.j.entity.Ticket;
import ua.j.repository.TicketRepository;
import ua.j.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public void saveTicket(Ticket ticket) {
		ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> findAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findTicketById(int id) {
		return ticketRepository.getOne(id);
	}

	
}
