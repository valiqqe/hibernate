package org.example.dao.ticket;

import org.example.entity.Planet;
import org.example.entity.Ticket;

import java.util.List;

public interface TicketDao {
    boolean createTicket(Ticket ticket);

    Ticket getTicketById(Long ticketId);

    List<Ticket> getAllTickets();

    void deleteTicketById(Long ticketId);
}