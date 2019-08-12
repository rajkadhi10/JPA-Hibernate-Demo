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
public class ItemDaoImpl implements ItemDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void create(int sallerId, Item item) {
        try {
            entityManager.getTransaction().begin();
            Users user = entityManager.find(Users.class, sallerId);
            user.getItems().add(item);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Item get(int id) {
        Item item = null;
        try {
            item = entityManager.find(Item.class, id);
        } catch (Exception e) {
        }
        return item;
    }

    @Override
    public List<Item> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
