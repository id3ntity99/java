package dao.internal;

public class NoSuchProductException extends RuntimeException {
  public NoSuchProductException(String message) {
    super(message);
  }
}
