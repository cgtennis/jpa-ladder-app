package org.cgtennis.ladderapp.dto;

public record PlayerDto(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String ratingCode,
        String gender,
        String location,
        String availability) {
}
