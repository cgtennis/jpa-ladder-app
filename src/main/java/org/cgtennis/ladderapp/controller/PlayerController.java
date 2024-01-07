package org.cgtennis.ladderapp.controller;

import org.cgtennis.ladderapp.model.Player;
import org.cgtennis.ladderapp.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("api/players")
    public List<Player> getPlayers(){
        return  playerRepository.findAll();
    }
}
