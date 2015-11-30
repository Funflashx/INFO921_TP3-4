package fr.INFO921.TP3_4.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */

@Entity
@Table
public class Backlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BACKLOG_ID")
    private Long _id;
    private String name;

    @OneToOne(fetch= FetchType.LAZY, mappedBy="myBacklog")
    private Agency owner;
    @OneToMany(mappedBy="TICKET_ID")
    private List<Ticket> ticketsList;

    @Override
    public String toString() {
        return "Backlog{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", ticketsList=" + ticketsList +
                '}';
    }
}
