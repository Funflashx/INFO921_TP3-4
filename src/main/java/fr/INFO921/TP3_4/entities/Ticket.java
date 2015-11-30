package fr.INFO921.TP3_4.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Entity
@Table
public class Ticket {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="TICKET_ID")
    private Long _id;
    private String name;
    private Date creation_date;
    private Integer priority;
    private Integer estimation;
    private String description;
    @OneToMany(mappedBy="COMMENT_ID")
    private List<Comment> commentsList;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BACKLOG_ID")
    private Backlog backlog;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Integer getEstimation() {
        return estimation;
    }

    public void setEstimation(Integer estimation) {
        this.estimation = estimation;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", creation_date=" + creation_date +
                ", priority=" + priority +
                ", estimation=" + estimation +
                ", description='" + description + '\'' +
                ", commentsList=" + commentsList +
                ", backlog=" + backlog +
                '}';
    }
}
