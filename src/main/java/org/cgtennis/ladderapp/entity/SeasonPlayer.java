package org.cgtennis.ladderapp.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="season_players")
public class SeasonPlayer {

    @EmbeddedId
    private SeasonPlayerKey  id;

    @ManyToOne
    @MapsId("season_id")
    @JoinColumn(name = "season_id", referencedColumnName = "season_id")
    private Season season;


    @ManyToOne
    @MapsId("player_id")
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player;

    public SeasonPlayer() {
    }

    public SeasonPlayer(Season season, Player player) {
        this.season = season;
        this.player = player;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeasonPlayer that = (SeasonPlayer) o;
        return Objects.equals(season, that.season) && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(season, player);
    }

    @Override
    public String toString() {
        return "SeasonPlayer{" +
                "season=" + season +
                ", player=" + player +
                '}';
    }
}
