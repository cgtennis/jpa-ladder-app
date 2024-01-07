package org.cgtennis.ladderapp.repository;

import org.cgtennis.ladderapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

    
}
