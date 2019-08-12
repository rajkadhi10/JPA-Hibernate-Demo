package com.argus.initilizer;

import com.argus.dao.AddressDaoImpl;
import com.argus.dao.CommentDaoImpl;
import com.argus.dao.CategoryDaoImpl;
import com.argus.dao.CategoryDao;
import com.argus.dao.ShipmentDaoImpl;
import com.argus.dao.ItemDaoImpl;
import com.argus.dao.BidDaoImpl;
import com.argus.dao.AddressDao;
import com.argus.dao.UserDaoImpl;
import com.argus.dao.BidDao;
import com.argus.dao.BillingDetailsDao;
import com.argus.dao.BillingDetailsDaoImpl;
import com.argus.dao.UserDao;
import com.argus.dao.ShipmentDao;
import com.argus.dao.ItemDao;
import com.argus.dao.CommentDao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raj
 */
public class ShoppingCart {

    public static void main(String[] args) {
        AddressDao addressRepo = new AddressDaoImpl();
        BidDao bidRepo = new BidDaoImpl();
        BillingDetailsDao billingDetailsRepo = new BillingDetailsDaoImpl();
        CategoryDao categoryRepo = new CategoryDaoImpl();
        CommentDao commentRepo = new CommentDaoImpl();
        ItemDao itemRepo = new ItemDaoImpl();
        ShipmentDao shipmentRepo = new ShipmentDaoImpl();
        UserDao userRepo = new UserDaoImpl();

    }
}
