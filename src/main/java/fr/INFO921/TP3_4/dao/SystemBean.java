package fr.INFO921.TP3_4.dao;

import fr.INFO921.TP3_4.interfaces.SystemService;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Stateful
public class SystemBean implements SystemService {

    @PersistenceContext(unitName = "backlogBD")
    protected EntityManager entityManager;

}
