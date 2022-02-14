package Creational.Builder;

public class Client {
  public static void main(String[] args) {
    ActorController ac = new ActorController();
    ActorBuilder ab = new WhiteBuilder();
    Actor actor = ac.construct(ab);
    System.out.println(actor.getType());
  }
}
