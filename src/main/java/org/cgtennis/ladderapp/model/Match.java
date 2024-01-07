package org.cgtennis.ladderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="match_id")
    private int matchId;

    @ManyToOne
    @JoinColumn(name="season_id",referencedColumnName = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name="winner_id",referencedColumnName = "player_id")
    private Player winnder;

    @ManyToOne
    @JoinColumn(name="loser_id",referencedColumnName = "player_id")
    private Player loser;

    @Column(name="match_date")
    private LocalDate matchDate;

    @Column(name="set1_score")
    private String set1Score;

    @Column(name="set2_score")
    private String set2Score;

    @Column(name="set3_score")
    private String set3Score;
}
