package com.argus.dao;

import com.argus.model.BillingDetails;
import java.util.List;

/**
 *
 * @author raj
 */
public interface BillingDetailsDao {
    public void create(int userId, BillingDetails billingDetail);
    public BillingDetails get(int id);
    public List<BillingDetails> getAll();
}
