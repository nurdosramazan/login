package kz.test.login.exception;

public class UnsuccessfulRegistrationException extends RuntimeException {
  public UnsuccessfulRegistrationException(String message) {
    super(message);
  }
}
