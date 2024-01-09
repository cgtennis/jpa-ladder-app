package org.cgtennis.ladderapp.entity;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.xml.bind.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class RatingTest {

    @DisplayName("Create a Rating object without ratingNum, to make sure ratingNum is auto calculated")
    @Test
    void canCreateRatingObjectWithoutRatingNum()
    {
        Rating rating1 = new Rating();
        rating1.setRatingCode("3.5");
        assertEquals(rating1.getRatingCode(),"3.5");
        assertEquals(rating1.getRatingNum(),3.5);
    }

    @DisplayName("Should not create a rating object other than allowed by Regex")
    @Test
    void shouldNotCreateAnInvalidRatingObject()
    {
        Rating rating = new Rating("3.75");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Rating>> violations = validator.validate(rating);
        assertEquals(1, violations.size());
        violations.forEach( x ->
            {
                assertEquals("Invalid rating",x.getMessage());
                assertEquals("ratingCode",x.getPropertyPath().toString());
            }
        );

    }

}