package org.example;

import org.example.entity.Planet;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Session session = HibernateUtils.getInstance().getSessionFactory().openSession();

//		Transaction transaction = session.beginTransaction();
//
//            Client newClient = new Client();
//			newClient.setName("Valik Marski");
//            session.persist(newClient);
//
//            Planet newPlanet = new Planet();
//			newPlanet.setId("PLN");
//			newPlanet.setName("Plutonium");
//            session.persist(newPlanet);
//
//        transaction.commit();


//        Client gettedClient = session.get(Client.class, 1L);
//        System.out.println("client ==> " + gettedClient);

//			Planet gettedPlanet = session.get(Planet.class, "VEN");
//    	    System.out.println("planet ==> " + gettedPlanet);

//        List<Client> clients = session.createQuery("from Client", Client.class).list();
//        clients.forEach(client -> System.out.println("client list ==> " + client));

        List<Planet> planets = session.createQuery("from Planet", Planet.class).list();
        planets.forEach(planet -> System.out.println("planet list ==> " + planet));


//        Transaction transaction = session.beginTransaction();
//
//            Client existing = session.get(Client.class, 11L);
//
//			Planet existing = session.get(Planet.class, "PLN");
//
//            session.remove(existing);
//        transaction.commit();

        session.close();
    }
}
