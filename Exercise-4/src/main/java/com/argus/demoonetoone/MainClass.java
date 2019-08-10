/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.demoonetoone;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author raj
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    private static EntityManager em;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("HelloWorld");
        em = emf.createEntityManager();
        Student student;
        Address address;
        Education education;
        address = new Address("D-201", "ADI", "GUJ", "IND", "380058");
        education = new Education("Engineering", "B.Tech", "2019", "Alpha");
        student = new Student("Raj", "Kadhi", "Mr.", "ER.", "raj.kadhi10@gmail.com", 
                "9429515793", address, education);
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
        }
    }
}
