package com.argus.dao;

import com.argus.model.Comment;
import java.util.List;

/**
 *
 * @author raj
 */
public interface CommentDao {
    public void create(int userId, int itemId, Comment comment);
    public Comment get(int id);
    public List<Comment> getAll();
}
