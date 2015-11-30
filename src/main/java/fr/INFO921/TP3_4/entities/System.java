package fr.INFO921.TP3_4.entities;

import javax.persistence.*;
import java.util.List;


/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Entity
@Table
public class System {
    @OneToMany(mappedBy="USER_ID")
    private List<User> userList;
    @OneToMany(mappedBy="AGENCY_ID")
    private List<Agency> agencyList;
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "System{" +
                "userList=" + userList +
                ", agencyList=" + agencyList +
                ", id='" + id + '\'' +
                '}';
    }
}
