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
public class ShipmentDaoImpl implements ShipmentDao{

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void create(int itemId, int buyerId, int sallerId, int addresId, Shipment shipment) {
        try {
            entityManager.getTransaction().begin();
            shipment.setItem_id(entityManager.find(Item.class, itemId));
            shipment.setSeller(entityManager.find(Users.class, sallerId));
            shipment.setBuyer(entityManager.find(Users.class, buyerId));
            shipment.setDilivery(entityManager.find(Address.class, addresId));
            entityManager.persist(shipment);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Shipment get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Shipment> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
