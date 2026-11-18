package main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class User {
    String firstName;
    String lastName;
    String email;
    LocalDate dob;//dateOfBirth
    String city;


}










