package Creational.Singleton;

//Initialization Demand Holder (IoDH)
public class Method5 {

  private Method5() {}

  private static class Method5Holder {
    private static final Method5 instance = new Method5();
  }

  public Method5 getInstance() {
    return Method5Holder.instance;
  }
}
