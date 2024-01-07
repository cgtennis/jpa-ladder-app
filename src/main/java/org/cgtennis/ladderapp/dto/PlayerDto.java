package org.cgtennis.ladderapp.dto;

public record PlayerDto(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String ratingId,
        String gender,
        String location,
        String availability) {
}
