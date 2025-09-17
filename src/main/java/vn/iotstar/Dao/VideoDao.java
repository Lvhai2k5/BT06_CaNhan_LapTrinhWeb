package vn.iotstar.Dao;

import vn.iotstar.entity.Video;
import java.util.List;

public interface VideoDao {
    void insert(Video v);
    void update(Video v);
    void delete(int id);
    Video findById(int id);
    List<Video> findAll();
    List<Video> findByCategory(int categoryId);
    List<Video> search(String keyword);
}
