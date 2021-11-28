package Singleton;

public class EagerSingle {
  private static final EagerSingle instance = new EagerSingle();
  private EagerSingle(){}
  public static EagerSingle getInstance() {
    return instance;
  }
}
