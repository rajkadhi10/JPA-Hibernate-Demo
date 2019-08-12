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
public class CommentDaoImpl implements CommentDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void create(int userId, int itemId, Comment comment) {
        try {
            entityManager.getTransaction().begin();
            comment.setUser(entityManager.find(Users.class, userId));
            comment.setItem(entityManager.find(Item.class, userId));
            entityManager.persist(comment);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Comment get(int id) {
        Comment comment = null;
        try {
            comment = entityManager.find(Comment.class, id);
        } catch (Exception e) {
        }
        return comment;
    }

    @Override
    public List<Comment> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
