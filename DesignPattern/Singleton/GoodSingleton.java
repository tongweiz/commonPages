package Singleton;

public class GoodSingleton {
  private GoodSingleton() {}
  private static class LoadInstance {
    private static final GoodSingleton instance = new GoodSingleton();
  }

  public static GoodSingleton getInstance() {
    return LoadInstance.instance;
  }
}