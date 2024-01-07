package org.cgtennis.ladderapp.repository;

import org.cgtennis.ladderapp.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {


}
