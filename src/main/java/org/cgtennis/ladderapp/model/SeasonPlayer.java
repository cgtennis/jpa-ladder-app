package org.cgtennis.ladderapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

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
}
