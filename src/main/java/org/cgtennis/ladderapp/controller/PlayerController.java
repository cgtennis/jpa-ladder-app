package org.cgtennis.ladderapp.controller;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("api/players/{id}")
    public PlayerDto getPlayers(@PathVariable("id") int id){

        return  playerService.findById(id);
    }


    @PostMapping("api/players")
    public void save(@RequestBody PlayerDto playerDto){
        playerService.save(playerDto);
    }


}
