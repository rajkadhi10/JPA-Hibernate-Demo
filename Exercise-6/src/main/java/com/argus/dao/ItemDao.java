package com.argus.dao;

import com.argus.model.Item;
import java.util.List;

/**
 *
 * @author raj
 */
public interface ItemDao {
    public void create(int sallerId, Item item);
    public Item get(int id);
    public List<Item> getAll();
}
