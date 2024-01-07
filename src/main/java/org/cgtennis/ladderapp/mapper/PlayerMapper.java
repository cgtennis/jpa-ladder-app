package org.cgtennis.ladderapp.mapper;

import org.cgtennis.ladderapp.dto.PlayerDto;
import org.cgtennis.ladderapp.entity.Player;
import org.cgtennis.ladderapp.entity.Rating;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    @Mapping(target="ratingCode",source = "rating.ratingCode")
    PlayerDto toDto(Player player);

    @Mapping(target = "rating.ratingCode", source = "ratingCode")
    Player toEntity(PlayerDto playerDto);

    @Mapping(target="ratingCode",source = "rating.ratingCode")
    List<PlayerDto> toDto(List<Player> players);

    List<Player> toEntity (List<PlayerDto> playerDtos);



}
