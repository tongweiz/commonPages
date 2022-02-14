package Creational.Singleton;

//eager, system resources
public class Method2 {
  private static final Method2 instance = new Method2();
  private Method2(){}

  public static Method2 getInstance() {
    return instance;
  }
}
