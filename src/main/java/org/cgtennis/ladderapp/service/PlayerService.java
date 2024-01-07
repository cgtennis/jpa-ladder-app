package org.cgtennis.ladderapp.service;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.entity.Player;
import org.cgtennis.ladderapp.mapper.PlayerMapper;
import org.cgtennis.ladderapp.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerService(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public List<PlayerDto> findAll(){
        return playerMapper.toDto(playerRepository.findAll());
    }

    public PlayerDto findById(int id) throws RuntimeException {
        Optional<Player> player = playerRepository.findById(id);
        if(player.isPresent())
            return playerMapper.toDto(player.get());
        else
            throw new RuntimeException("Not Found");

    }

    public void save(PlayerDto playerDto){
        Player player = playerMapper.toEntity(playerDto);
        playerRepository.save(player);
    }
}
