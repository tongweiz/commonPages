package Creational.Builder;

public class Client {
  public static void main(String[] args) {
    ActorBuilder ab = new WhiteBuilder();
    Actor actor = ab.construct();
    System.out.println(actor.getType());
  }
}
