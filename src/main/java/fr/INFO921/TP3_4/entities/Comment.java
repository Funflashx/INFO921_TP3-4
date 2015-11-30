package fr.INFO921.TP3_4.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Entity
@Table
public class Comment {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="COMMENT_ID")
    private Long _id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User owner;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TICKET_ID")
    private Ticket ticket;
    private String comment;
    private Date creation_date;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "_id=" + _id +
                ", owner=" + owner +
                ", ticket=" + ticket +
                ", comment='" + comment + '\'' +
                ", creation_date=" + creation_date +
                '}';
    }
}
