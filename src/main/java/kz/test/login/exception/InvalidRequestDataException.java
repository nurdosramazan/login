package kz.test.login.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;

@Getter
public class InvalidRegistrationFieldException extends RuntimeException {
    private BindingResult bindingResult;

    public InvalidRegistrationFieldException(BindingResult bindingResult) {
        super("Registration validation failed");
        this.bindingResult = bindingResult;
    }
}
