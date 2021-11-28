package Singleton;

public class Singleton1 {
  private static Singleton1 single1;
  private Singleton1(){}
  public void showInfo(){}
  public void showService(){}
  public static Singleton1 getInstance() {
    if (single1 == null) {
      single1 = new Singleton1();
    }
    return single1;
  }
}
