package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import main.specialAnnotation.PasswordMatch;
import javax.validation.constraints.*;

@PasswordMatch
@Setter
@Getter
public class UserModel {

    @NotBlank(message = "this field is required")
    private String userName;

    //@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,}$", message = "the email not valid")
    @NotBlank(message = "this field is required")
    @Email(message = "the email not valid")
    private String email;

    @NotBlank(message = "this field is required")
    @Size(min = 6,message="should be more than 6 or equal")
    private String password;


    @NotBlank(message = "this field is required")
    private String confirmPassword;

}
