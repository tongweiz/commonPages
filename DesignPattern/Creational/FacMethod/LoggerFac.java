package Creational.FacMethod;

abstract class LoggerFac {

  public void writeLog() {
    Logger logger = this.createLogger();
    logger.writeLog();
  }
  public abstract Logger createLogger();
}