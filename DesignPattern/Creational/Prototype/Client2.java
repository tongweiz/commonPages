package Creational.Prototype;

public class Client2 {
  public static void main(String[] args) {
    WeeklyLog2 log_old, log_new = null;
    log_old = new WeeklyLog2();
    Attachment at1 = new Attachment();
    log_old.setAt1(at1);
    try {
      log_new = log_old.deepClone();
    } catch (Exception e) {
      System.out.println("Clone failed");
    }

    System.out.println("Same Attachment?"+(log_old.getAt1()==log_new.getAt1()));
  }
}
