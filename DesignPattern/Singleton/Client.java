package Singleton;

public class Client {
  public static void main(String[] args) {
    Singleton1 single1 = Singleton1.getInstance();
    Singleton1 single2 = Singleton1.getInstance();
    System.out.println(single1 == single2);
  }
}
