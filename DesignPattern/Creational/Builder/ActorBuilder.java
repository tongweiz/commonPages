package Creational.Builder;

abstract class ActorBuilder {

  protected Actor actor = new Actor();
  public abstract void buildType();
  public abstract void buildSex();
  public abstract void buildHand();
  public abstract void buildEye();

  public Actor construct() {
    this.buildHand();
    this.buildSex();
    this.buildEye();
    this.buildType();
    return actor;
  }
}
