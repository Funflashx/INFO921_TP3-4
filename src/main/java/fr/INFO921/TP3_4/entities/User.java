package fr.INFO921.TP3_4.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by François Caillet on 25/11/2015.
 * All rights reserved.
 */
@Entity
@Table
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private Long _id;
    private String first;
    private String last;
    @OneToMany(mappedBy="owner")
    private List<Comment> commentsList;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id=" + _id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", commentsList=" + commentsList +
                '}';
    }
}
