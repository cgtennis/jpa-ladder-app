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
    @Column(name = "rating")
    private String rating;

    @Column(name = "rating_num",nullable = false)
    private Double ratingNum;

    @Column(name="description")
    private String description;


    // constructors, getters, and setters...

    public Rating() {
    }

    public Rating(String rating, Double ratingNum, String description) {
        this.rating = rating;
        this.ratingNum = ratingNum;
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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
        return Objects.equals(rating, rating1.rating) && Objects.equals(ratingNum, rating1.ratingNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, ratingNum);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingNum=" + ratingNum +
                '}';
    }
}