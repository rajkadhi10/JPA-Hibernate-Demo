package com.argus.dao;

import com.argus.model.Users;
import java.util.List;

/**
 *
 * @author raj
 */
public interface UserDao {
    public void create(Users user);
    public Users get(int id);
    public List<Users> getAll();
}
