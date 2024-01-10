package org.cgtennis.ladderapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.cgtennis.ladderapp.util.MyRegexPatterns;

public record PlayerDto(

        @Size(max=50)
        @NotNull
        String firstName,

        @Size(max=50)
        @NotNull
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
