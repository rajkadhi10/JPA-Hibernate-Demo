package com.argus.dao;

import com.argus.model.Address;
import com.argus.model.Bid;
import com.argus.model.BillingDetails;
import com.argus.model.Category;
import com.argus.model.Comment;
import com.argus.model.Item;
import com.argus.model.Shipment;
import com.argus.model.Users;
import com.argus.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author raj
 */
public class BidDaoImpl implements BidDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void create(int userId, int itemId, Bid bid) {
        try {
            entityManager.getTransaction().begin();
            bid.setBuyer(entityManager.find(Users.class, userId));
            bid.setItem_id(entityManager.find(Item.class, itemId));
            entityManager.persist(bid);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Bid get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bid> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
