package org.cgtennis.ladderapp.controller;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.service.PlayerService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<PlayerDto>> getPlayers(){

        return ResponseEntity.ok().header("my-tennis-header","welcome tennis fan!")
                .body(playerService.findAll());
    }

    @GetMapping("api/players/{id}")
    public ResponseEntity<PlayerDto> getPlayers(@PathVariable("id") int id){
        PlayerDto playerDto = playerService.findById(id);
        return ResponseEntity.ok(playerDto);
    }


    @PostMapping("api/players")
    public void save(@RequestBody PlayerDto playerDto){
        playerService.save(playerDto);
    }


}
