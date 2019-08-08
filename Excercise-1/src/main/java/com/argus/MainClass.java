package com.argus;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass {

    private static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("HelloWorld");
        em = emf.createEntityManager();
        HelloWorld msg;
        Scanner input = new Scanner(System.in);
        String c = "y";
        do {
            System.out.println("1. Enter  2. Retrive");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Employee Name");
                    String name = input.next();
                    msg = new HelloWorld(name);
                    em.getTransaction().begin();
                    em.persist(msg);
                    em.getTransaction().commit();
                    break;
                case 2:
                    try {
                        em.getTransaction().begin();
                        Query query = em.createQuery("SELECT e FROM HelloWorld e");
                        List lst = query.getResultList();
                        Iterator it = lst.iterator();
                        while (it.hasNext()) {
                            HelloWorld msg1;
                            msg1 = (HelloWorld) it.next();
                            System.out.println("Id:" + msg1.getId());
                            System.out.println(" Message:" + msg1.getName());
                        }
                        em.getTransaction().commit();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

            System.out.println("Continue?");
            c = input.next();
        } while (!"n".equals(c));

    }

}
