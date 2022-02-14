package Creational.Singleton;

//doubleLock
public class Method4 {
  private  volatile static Method4 instance;

  private Method4(){}

  public static Method4 getInstance() {
    if(instance==null) {
      synchronized (Method4.class) {
        if(instance==null){
          instance = new Method4();
        }
      }
    }
    return instance;
  }
}
