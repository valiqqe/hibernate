package org.example;

import org.example.dao.ClientCrudService;
import org.example.dao.ClientDao;
import org.example.dao.PlanetCrudService;
import org.example.dao.PlanetDao;
import org.example.dao.TicketCrudService;
import org.example.dao.TicketDao;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {
//      List<Ticket> result = new TicketCrudService().getAllTickets();
//      result.forEach(t -> System.out.println(t.getId()));

//        Client client = new Client();
//		client.setName("New Client");
//		ClientDao dao = new ClientCrudService();
//		boolean result = dao.createClient(client);
//		System.out.println("result ===> " + result);
//
//		Planet planet1 = new Planet();
//		planet1.setId("EEA2");
//		planet1.setName("Earth");
//		PlanetDao dao2 = new PlanetCrudService();
//		boolean result2 = dao2.createPlanet(planet1);
//		System.out.println("result2 ===> " + result2);
//
//		Planet planet2 = new Planet();
//		planet2.setId("MOO3");
//		planet2.setName("Moon");
//		PlanetDao dao3 = new PlanetCrudService();
//		boolean result3 = dao3.createPlanet(planet2);
//		System.out.println("result3 ===> " + result3);
//
//        Ticket ticket = new Ticket();
//        ticket.setClient(client);
//		ticket.setCreatedAt(LocalDateTime.now());
//		ticket.setPlanetSt(planet1);
//		ticket.setPlanetFin(planet2);
//        client.getTickets().add(ticket);
//		planet1.getTickets().add(ticket);
//		planet2.getTickets1().add(ticket);
//
//		TicketDao dao1 = new TicketCrudService();
// 		boolean result1 = dao1.createTicket(ticket);
//		System.out.println("result1 ===> " + result1);

//		Ticket result = new TicketCrudService().getTicketById(2L);
//		System.out.println(result.getCreatedAt());

//		Client client = new ClientCrudService().getClientById(13L);
//		client.getTickets().forEach(t -> System.out.println(t.getId()));

    }
}