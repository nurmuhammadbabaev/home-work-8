package peaksoft.vseMetody;

import peaksoft.entity.Users;

import java.util.List;

public interface UserDao {
    long create(List<Users> users);
    List<Users> reade(String name, int age);
    void update(String name);
    void cleane(String name);
    void delete();
}
