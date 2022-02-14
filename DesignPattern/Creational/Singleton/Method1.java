package Creational.Singleton;


// concurrent problem
public class Method1 {
  private static Method1 m1;
  private Method1() {

  }

  public void showProcesses(){}
  public void showServices(){}
  public static Method1 getInstance() {
    if(m1 == null) {
      m1 = new Method1();
    }
    return m1;
  }
}
