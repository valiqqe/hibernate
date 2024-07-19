package org.example.dao.ticket;

import org.example.entity.Ticket;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TicketCrudService implements TicketDao {

    private static final String GET_ALL_TICKET_QUERY = "from Ticket";

    @Override
    public boolean createTicket(Ticket ticket) {
        boolean result = false;
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                ticket.setId(null);
                session.persist(ticket);
                transaction.commit();
                result = true;
            } catch(Exception ex) {
                ex.printStackTrace();
                transaction.rollback();
            }
        }
        return result;
    }

    @Override
    public Ticket getTicketById(Long ticketId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            return session.get(Ticket.class, ticketId);
        }
    }

    @Override
    public List<Ticket> getAllTickets() {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            return session.createQuery(GET_ALL_TICKET_QUERY, Ticket.class).list();
        }
    }

    @Override
    public void deleteTicketById(Long ticketId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Ticket existing = session.get(Ticket.class, ticketId);
            session.remove(existing);
            transaction.commit();
        }
    }
}
