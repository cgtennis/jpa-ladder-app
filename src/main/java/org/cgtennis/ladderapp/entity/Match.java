package org.cgtennis.ladderapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

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

    public Match() {
    }

    public Match(Season season, Player winnder, Player loser, LocalDate matchDate, String set1Score, String set2Score, String set3Score) {
        this.season = season;
        this.winnder = winnder;
        this.loser = loser;
        this.matchDate = matchDate;
        this.set1Score = set1Score;
        this.set2Score = set2Score;
        this.set3Score = set3Score;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Player getWinnder() {
        return winnder;
    }

    public void setWinnder(Player winnder) {
        this.winnder = winnder;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getSet1Score() {
        return set1Score;
    }

    public void setSet1Score(String set1Score) {
        this.set1Score = set1Score;
    }

    public String getSet2Score() {
        return set2Score;
    }

    public void setSet2Score(String set2Score) {
        this.set2Score = set2Score;
    }

    public String getSet3Score() {
        return set3Score;
    }

    public void setSet3Score(String set3Score) {
        this.set3Score = set3Score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return matchId == match.matchId && Objects.equals(season, match.season) && Objects.equals(winnder, match.winnder) && Objects.equals(loser, match.loser) && Objects.equals(matchDate, match.matchDate) && Objects.equals(set1Score, match.set1Score) && Objects.equals(set2Score, match.set2Score) && Objects.equals(set3Score, match.set3Score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchId, season, winnder, loser, matchDate, set1Score, set2Score, set3Score);
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", season=" + season +
                ", winnder=" + winnder +
                ", loser=" + loser +
                ", matchDate=" + matchDate +
                ", set1Score='" + set1Score + '\'' +
                ", set2Score='" + set2Score + '\'' +
                ", set3Score='" + set3Score + '\'' +
                '}';
    }
}
