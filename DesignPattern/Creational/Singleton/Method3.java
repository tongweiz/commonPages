package Creational.Singleton;

//Lazy
public class Method3 {

  private static Method3 instance;

  private Method3(){}

  synchronized public static Method3 getInstance() {
    if(instance==null){
      instance = new Method3();
    }
    return instance;
  }
}
