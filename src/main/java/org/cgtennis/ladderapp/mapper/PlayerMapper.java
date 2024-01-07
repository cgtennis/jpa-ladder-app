package org.cgtennis.ladderapp.mapper;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.entity.Player;
import org.cgtennis.ladderapp.entity.Rating;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PlayerMapper {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    PlayerDto mapToDto(Player player);

    Player mapFromDto(PlayerDto playerDto);

    List<PlayerDto> mapToDto(List<Player> players);

    List<Player> mapFromDto (List<PlayerDto> playerDtos);


    default String mapRatingToRatingId(Rating rating) {
        return (rating!=null)?rating.getRatingId() : null;
    }
}
