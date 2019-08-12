package com.argus.dao;

import com.argus.model.Bid;
import java.util.List;

/**
 *
 * @author raj
 */
public interface BidDao {
    public void create(int userId, int itemId, Bid bid);
    public Bid get(int id);
    public List<Bid> getAll();
}
