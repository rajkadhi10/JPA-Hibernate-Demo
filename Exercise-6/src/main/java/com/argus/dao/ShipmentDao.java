package com.argus.dao;

import com.argus.model.Shipment;
import java.util.List;

/**
 *
 * @author raj
 */
public interface ShipmentDao {
    public void create(int itemId, int buyerId, int sallerId, int addresId, Shipment shipment);
    public Shipment get(int id);
    public List<Shipment> getAll();
}
