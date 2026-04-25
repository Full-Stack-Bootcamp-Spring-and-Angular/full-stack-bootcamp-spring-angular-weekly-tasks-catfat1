package main.specialAnnotation;

import main.com.myApp.model.UserModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordMatchValidator
        implements ConstraintValidator<PasswordMatch, UserModel> {
    @Override
    public boolean isValid(UserModel user, ConstraintValidatorContext context) {
        if (user.getPassword() == null || user.getConfirmPassword() == null) {
            return true; // Let @NotBlank handle these
        }

        boolean matches = user.getPassword().equals(user.getConfirmPassword());
        if (!matches) {
            // Attach error specifically to the confirmPassword field
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation();
        }
        return matches;
    }
}
