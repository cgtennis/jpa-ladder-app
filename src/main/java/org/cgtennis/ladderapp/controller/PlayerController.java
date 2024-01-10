package org.cgtennis.ladderapp.controller;

import jakarta.validation.Valid;
import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.exception.PlayerNotFoundException;
import org.cgtennis.ladderapp.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping
    public ResponseEntity<List<PlayerDto>> getPlayers(){

        return ResponseEntity.ok(playerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerDto> getPlayers(@PathVariable("id") int id)  throws PlayerNotFoundException {
        return ResponseEntity.ok(playerService.findById(id));
    }


    @PostMapping
    public ResponseEntity<PlayerDto> save(@RequestBody @Valid PlayerDto playerDto){
        return new ResponseEntity<>(playerService.save(playerDto), HttpStatus.CREATED);
    }


}
