package fr.INFO921.TP3_4.dao;

import fr.INFO921.TP3_4.entities.User;
import fr.INFO921.TP3_4.interfaces.UserService;

import javax.ejb.Stateful;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */

@Stateful
@ManagedBean
public class UserBean implements UserService {

    private Logger logger = Logger.getLogger(getClass().getName());


    @PersistenceContext(unitName = "backlogBD")
    protected EntityManager entityManager;

    public void saveUser(User user) {
        logger.info("Enregistrement du user : " + user.toString());
        if (user.get_id() == null) {
            logger.info("In save new user");
            entityManager.persist(user);
        }else {
            logger.info("In update user");
            entityManager.merge(user);
        }
    }

    public User findUserById(Long id) {
        return entityManager.find(User.class, id);
    }


    public void deleteUser(User user) {
        entityManager.remove(user);
    }
}
