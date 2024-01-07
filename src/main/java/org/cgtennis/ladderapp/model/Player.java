package org.cgtennis.ladderapp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tblPlayer")
public class Player {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="firstName",nullable = false,length = 50)
    private String firstName;

    @Column(name="lastName",nullable = false, length = 50)
    private String lastName;

    @Column(name="phoneNumber", length=50)
    private String phoneNumber;

    @Column(name="email",nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "rating", referencedColumnName = "rating")
    private Rating rating;

    @Column(name = "location")
    private String location;

    @Column(name="availability")
    private String availability;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id == player.id && Objects.equals(firstName, player.firstName) && Objects.equals(lastName, player.lastName) && Objects.equals(phoneNumber, player.phoneNumber) && Objects.equals(email, player.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                ", location='" + location + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
