package org.cgtennis.ladderapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.util.Objects;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @Column(name = "rating_id")
    private String ratingId;

    @Column(name = "rating_num",nullable = false)
    private Double ratingNum;

    @Column(name="description")
    private String description;


    // constructors, getters, and setters...

    public Rating() {
    }

    public Rating(String ratingId, Double ratingNum, String description) {
        this.ratingId = ratingId;
        this.ratingNum = ratingNum;
        this.description = description;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String rating) {
        this.ratingId = rating;
    }

    public Double getRatingNum() {
        return ratingNum;
    }

    public void setRatingNum(Double ratingNum) {
        this.ratingNum = ratingNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating1 = (Rating) o;
        return Objects.equals(ratingId, rating1.ratingId) && Objects.equals(ratingNum, rating1.ratingNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingId, ratingNum);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingNum=" + ratingNum +
                '}';
    }


}