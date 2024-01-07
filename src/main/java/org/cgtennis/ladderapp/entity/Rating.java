package org.cgtennis.ladderapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @Pattern(regexp = "^(2\\.0|2\\.5|3\\.0|3\\.5|4\\.0|4\\.5|5\\.0|5\\.5)$", message = "Invalid rating")
    @Column(name = "rating_code")
    private String ratingCode;

    @DecimalMin(value = "2.5", message = "Rating number must be greater or equal to 2.5")
    @DecimalMax(value = "5.5", message = "Rating number must be less than or equal to 5.5")
    @Column(name = "rating_num",nullable = false)
    private double ratingNum;

    @Column(name="description")
    private String description = "";


    // constructors, getters, and setters...

    public Rating() {
    }


    public double getRatingNum() {
        if (ratingNum == 0.0 && ratingCode != null)
               return Double.parseDouble(ratingCode);
        else
            return ratingNum;
    }


    public Rating(String ratingCode, double ratingNum, String description) {
        this.ratingCode = ratingCode;
        this.ratingNum = ratingNum;
        this.description = description;
    }

    public String getRatingCode() {
        return ratingCode;
    }

    public void setRatingCode(String rating) {
        this.ratingCode = rating;
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
        return Objects.equals(ratingCode, rating1.ratingCode) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingCode);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingCode=" + ratingCode +
                '}';
    }


}