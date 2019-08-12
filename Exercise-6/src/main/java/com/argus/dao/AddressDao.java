package com.argus.dao;

import com.argus.model.Address;
import java.util.List;

/**
 *
 * @author raj
 */
public interface AddressDao {
    public void create(int userId, Address address);
    public Address get(int id);
    public List<Address> getAll();
}
