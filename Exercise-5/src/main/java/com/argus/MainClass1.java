/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus;

import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author raj
 */
public class MainClass1 {

    private static EntityManager em;

    public static void main(String[] args) throws FileNotFoundException {

        Logger logger
                = Logger.getLogger(MainClass1.class.getName());
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("test");
        em = emf.createEntityManager();
        Date now = new java.util.Date();
        Timestamp current = new Timestamp(now.getTime());
        String s = "Hello Raj";
        byte[] b1 = s.getBytes();

        Set<Attachment> att = new HashSet<Attachment>();
        Attachment attachment = new Attachment("abcd", "10", current, b1);
        Attachment attachment1 = new Attachment("xyzw", "10", current, b1);

        Set<Attachment> att1 = new HashSet<Attachment>();
        Attachment attachment2 = new Attachment("ABC", "210", current, b1);
        Attachment attachment3 = new Attachment("XYZ", "210", current, b1);

        att.add(attachment);
        att.add(attachment1);
        att1.add(attachment2);
        att1.add(attachment3);

        Set<Personnel> p = new HashSet<Personnel>();
        Personnel personnel = new Personnel("Raj", (QualificationLevel.q_level.Beginner), "9429515793");
        Personnel personnel1 = new Personnel("Rahul", (QualificationLevel.q_level.Intermediate), "9429525793");
        p.add(personnel);
        p.add(personnel1);

        Proposal proposal = new Proposal("Second Proposal", "Hey comments", p, att1);
////      insertdata(proposal);
////      removePraposal(4L);
//        update(2L,proposal);
        logger.info("+++" + get());

    }

    public static void put(Proposal proposal) {
        try {
            em.getTransaction().begin();
            em.persist(proposal);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
        }

    }

    public static List<Proposal> get() {
        List<Proposal> list = new ArrayList<>();
        System.out.println("in");
        try {

            list = em.createQuery("from Proposal").getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static void remove(Long id) {
        try {
            em.getTransaction().begin();
            Proposal proposal1 = em.find(Proposal.class, id);
            em.remove(proposal1);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
        }
    }

    public static Proposal getById(Long id) {
        Proposal proposal = null;
        try {
            proposal = em.find(Proposal.class, id);
        } catch (Exception e) {
        }
        return proposal;
    }

    public static void update(Long id, Proposal proposal) {

        try {
            em.getTransaction().begin();
            Proposal proposal1 = em.find(Proposal.class, id);
            proposal1.setComment(proposal.getComment());
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
        }
    }
}
