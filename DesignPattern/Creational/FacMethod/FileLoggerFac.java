package Creational.FacMethod;

public class FileLoggerFac extends LoggerFac {
  @Override
  public Logger createLogger() {
    return new FileLogger();
  }
}