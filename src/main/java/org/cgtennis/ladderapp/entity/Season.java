package org.cgtennis.ladderapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="seasons")
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="season_id")
    private int seasonId;

    @Column(name="season_name",nullable = false)
    private String seasonName;

    @Column(name="description")
    private String description;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name="is_active")
    boolean isActive;

    public Season() {
    }

    public Season(int seasonID, String seasonName, String description, LocalDate startDate, LocalDate endDate, boolean isActive) {
        this.seasonId = seasonID;
        this.seasonName = seasonName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonID) {
        this.seasonId = seasonID;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return seasonId == season.seasonId && isActive == season.isActive && Objects.equals(seasonName, season.seasonName) && Objects.equals(description, season.description) && Objects.equals(startDate, season.startDate) && Objects.equals(endDate, season.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonId, seasonName, description, startDate, endDate, isActive);
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonID=" + seasonId +
                ", seasonName='" + seasonName + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                '}';
    }
}
