package com.argus;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author raj
 */
public class MainClass extends HibernateUtil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Message");
        String name = input.next();
        
        insertdata(name);
    }

    public static void insertdata(String msg) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Message message = new Message(msg);
        session.saveOrUpdate(message);
        session.getTransaction().commit();
        System.out.println("Succeesss!!!!!!!!");

    }
}
