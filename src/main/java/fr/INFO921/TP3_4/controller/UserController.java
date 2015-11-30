package fr.INFO921.TP3_4.controller;

import fr.INFO921.TP3_4.entities.User;
import fr.INFO921.TP3_4.interfaces.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.logging.Logger;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Named
@RequestScoped
@ManagedBean
public class UserController {
    private Logger logger = Logger.getLogger(getClass().getName());

    public User user;

    public UserController() {
        logger.info("In ColisController");
    }

    @PostConstruct
    public void postConstruct() {
        user = new User();
        logger.info("In ColisController postConstruct");
    }

    public User getUser() {
        return user;
    }

    @EJB
    private UserService userService;

    public String saveUser() {
        String returnValue = "display_user"; //le controller renverra vers la page du colis
        logger.info("Sauvegarde du user : " + user.
                toString());

        try {
            userService.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            returnValue = "error_saving";
            return returnValue;
        }
        return returnValue;
    }
}
