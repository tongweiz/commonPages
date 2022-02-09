package Creational.FacMethod;

public class Client {
  public static void main(String[] args) {
    LoggerFac loggerFac;
    loggerFac = (LoggerFac) XMLUtil.getBean();
    loggerFac.writeLog();
  }
}