package vn.iotstar.Dao;

import vn.iotstar.entity.User;
import java.util.List;

public interface UserDao {
    void insert(User u);
    void update(User u);
    void delete(int id);
    User findById(int id);
    User findByUsername(String username);
    List<User> findAll();
    List<User> search(String keyword);
}
