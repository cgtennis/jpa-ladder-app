package org.cgtennis.ladderapp.dto;

import jakarta.validation.constraints.*;
import org.cgtennis.ladderapp.util.MyRegexPatterns;

public record PlayerDto(

        int playerId,

        @Size(max=50)
        @NotBlank
        String firstName,

        @Size(max=50)
        @NotBlank
        String lastName,

        @Size(max=255)
        @Email
        String email,

        @Size(max=255)
        String phoneNumber,

        @Pattern(regexp = MyRegexPatterns.REGEX_RATING, message = "Invalid rating")
        String ratingCode,

        @Pattern(regexp = MyRegexPatterns.REGEX_GENDER, message = "Invalid gender")
        String gender,
        String location,
        String availability) {
}
