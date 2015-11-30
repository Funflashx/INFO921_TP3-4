package fr.INFO921.TP3_4.interfaces;

import fr.INFO921.TP3_4.entities.User;

import javax.ejb.Local;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Local
public interface UserService {
    void saveUser(User user);
    User findUserById(Long id);
    void deleteUser(User user);
}
