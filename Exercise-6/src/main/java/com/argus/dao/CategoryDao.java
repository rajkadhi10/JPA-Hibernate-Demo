package com.argus.dao;

import com.argus.model.Category;
import java.util.List;

/**
 *
 * @author raj
 */
public interface CategoryDao {
    public void create(Category category);
    public Category get(int id);
    public List<Category> getAll();
}
