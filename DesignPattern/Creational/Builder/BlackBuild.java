package Creational.Builder;

public class BlackBuild extends ActorBuilder {
  @Override
  public void buildType() {
    actor.setType("Black");
  }

  @Override
  public void buildSex() {
    actor.setSex("blackSex");
  }

  @Override
  public void buildHand() {
    actor.setEye("blackHand");
  }

  @Override
  public void buildEye() {
    actor.setEye("blackEye");
  }
}
