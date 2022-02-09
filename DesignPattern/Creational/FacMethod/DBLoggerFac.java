package Creational.FacMethod;

public class DBLoggerFac extends LoggerFac {
  @Override
  public Logger createLogger() {
    return new DBLogger();
  }
}