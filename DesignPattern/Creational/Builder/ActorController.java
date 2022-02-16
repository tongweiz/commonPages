package Creational.Builder;

public class ActorController {
  public void construct(ActorBuilder ab) {
    Actor actor;
    ab.buildType();
    ab.buildEye();
    ab.buildSex();
    ab.buildHand();
//    return ab.createActor();
  }
}
