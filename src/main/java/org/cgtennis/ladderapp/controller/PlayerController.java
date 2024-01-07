package org.cgtennis.ladderapp.controller;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping("api/players")
    public List<PlayerDto> getPlayers(){


        return  playerService.findAll();
    }
}
