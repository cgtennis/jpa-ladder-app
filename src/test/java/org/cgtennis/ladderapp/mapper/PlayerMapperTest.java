package org.cgtennis.ladderapp.mapper;

import org.cgtennis.ladderapp.entity.Player;
import org.cgtennis.ladderapp.entity.Rating;
import org.cgtennis.ladderapp.dto.PlayerDto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class PlayerMapperTest {

    private PlayerMapper playerMapper = Mappers.getMapper(PlayerMapper.class);

    @Test
    public void testEntityToDto() {
        Player player = new Player(1,"John","Smith","615-286-4437","jsmith@example.com","M",new Rating("4.0"),null,null);
        PlayerDto playerDto = playerMapper.toDto(player);
        assertEquals(player.getFirstName(),playerDto.firstName());
        assertEquals(player.getLastName(),playerDto.lastName());
        assertEquals(player.getEmail(),playerDto.email());
        assertEquals(player.getPhoneNumber(),playerDto.phoneNumber());
        assertEquals(player.getRating().getRatingCode(),playerDto.ratingCode());
        assertEquals(player.getGender(),playerDto.gender());
        assertEquals(player.getLocation(),playerDto.location());
        assertEquals(player.getAvailability(),playerDto.availability());

    }

    @Test
    public void testDtoToEntity() {
        PlayerDto playerDto = new PlayerDto("John","Smith","jsmith@example.com","615-286-4437","3.5","M",null,null);
        Player player = playerMapper.toEntity(playerDto);
        assertEquals(player.getFirstName(),playerDto.firstName());
        assertEquals(player.getLastName(),playerDto.lastName());
        assertEquals(player.getEmail(),playerDto.email());
        assertEquals(player.getPhoneNumber(),playerDto.phoneNumber());
        assertEquals(player.getRating().getRatingCode(),playerDto.ratingCode());
        assertEquals(player.getGender(),playerDto.gender());
        assertEquals(player.getLocation(),playerDto.location());
        assertEquals(player.getAvailability(),playerDto.availability());

    }
}

