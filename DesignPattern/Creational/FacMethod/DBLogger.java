package Creational.FacMethod;

public class DBLogger implements Logger {

  @Override
  public void writeLog() {
    System.out.println("write DB log");
  }
}
