package org.cgtennis.ladderapp.service;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.mapper.PlayerMapper;
import org.cgtennis.ladderapp.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerService(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public List<PlayerDto> findAll(){
        return playerMapper.mapToDto(playerRepository.findAll());
    }
}
