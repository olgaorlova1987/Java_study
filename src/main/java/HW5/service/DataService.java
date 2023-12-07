package HW5.service;

import HW5.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}