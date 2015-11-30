package fr.INFO921.TP3_4.entities;

import javax.persistence.*;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Entity
@Table
public class Agency {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="AGENCY_ID")
    private Long id;

    private String name;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BACKLOG_ID")
    private Backlog myBacklog;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backlog getMyBacklog() {
        return myBacklog;
    }

    public void setMyBacklog(Backlog myBacklog) {
        this.myBacklog = myBacklog;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", myBacklog=" + myBacklog +
                '}';
    }
}
