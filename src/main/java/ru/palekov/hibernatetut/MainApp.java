package ru.palekov.hibernatetut;

//import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
        Session session = null;

        // ---- CREATE ----
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = new Item("Milk", 80);
        System.out.println(item);
        session.save(item);
        System.out.println(item);
        session.getTransaction().commit();

         // ---- READ ---
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        System.out.println(itemFromDb);
//        session.getTransaction().commit();

        // ---- UPDATE ----
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        System.out.println(itemFromDb);
//        itemFromDb.setTitle("Bread");
//        itemFromDb.setPrice(250);
//        session.getTransaction().commit();

        // ---- DELETE ----
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDb = session.get(Item.class, 1L);
//        session.remove(itemFromDb);
//        session.getTransaction().commit();

        sessionFactory.close();
    }
}
