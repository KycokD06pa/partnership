package bsu.project.partnership.service;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User addUser(User user);
    void delete(User user);
}
