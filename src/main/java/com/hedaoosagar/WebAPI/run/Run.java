package com.hedaoosagar.WebAPI.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startedOn,
        LocalDateTime endedOn,
        @Positive
        Integer miles,
        Location location
) {

    public Run {
//        if (!endedOn.isAfter(startedOn)) {
//            throw new IllegalArgumentException("Completed On must be after Started On");
//        }
    }
}
