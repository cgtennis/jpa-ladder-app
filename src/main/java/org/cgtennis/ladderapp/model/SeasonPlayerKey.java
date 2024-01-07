package org.cgtennis.ladderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SeasonPlayerKey implements Serializable {

    @Column(name="season_id")
    private int seasonId;

    @Column(name="player_id")
    private int playerId;
}
