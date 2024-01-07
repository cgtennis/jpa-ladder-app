package org.cgtennis.ladderapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;


import java.util.Objects;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="player_id")
    private int playerId;

    @Column(name="first_name",nullable = false,length = 50)
    private String firstName;

    @Column(name="last_name",nullable = false, length = 50)
    private String lastName;

    @Column(name="phone_number", length=50)
    private String phoneNumber;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="gender",length = 10)
    private String gender;

    @ManyToOne
    @JoinColumn(name = "rating", referencedColumnName = "rating")
    private Rating rating;

    @Column(name = "location")
    private String location;

    @Column(name="availability")
    private String availability;

    @Transient
    public String getDisplayName(){
        return firstName + " " + lastName;
    }

    public Player() {
    }

    public Player(String firstName, String lastName, String phoneNumber, String email, Rating rating, String location, String availability) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rating = rating;
        this.location = location;
        this.availability = availability;
    }


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerID) {
        this.playerId = playerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && Objects.equals(firstName, player.firstName) && Objects.equals(lastName, player.lastName) && Objects.equals(email, player.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                '}';
    }
}
