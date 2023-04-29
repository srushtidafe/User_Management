package com.example.UserValidation.Model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class User {
    private LocalDate date;

    private LocalTime time;
    @NotNull
    private String userId ;
    @NotEmpty(message = "Why is name empty")
    private String userName;
//    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
    private String dateOfBirth;
    @Email
    @NotEmpty
    private String email;
    @Size(min = 10 , max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNo;


}

