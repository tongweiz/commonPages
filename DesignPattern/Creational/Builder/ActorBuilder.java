package Creational.Builder;

abstract class ActorBuilder {

  protected Actor actor = new Actor();
  public abstract void buildType();
  public abstract void buildSex();
  public abstract void buildHand();
  public abstract void buildEye();

  public Actor createActor(){
    return actor;
  }
}
