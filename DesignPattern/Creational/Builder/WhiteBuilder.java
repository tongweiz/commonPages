package Creational.Builder;

public class WhiteBuilder extends ActorBuilder {
  @Override
  public void buildType() {
    actor.setType("white");
  }

  @Override
  public void buildSex() {
    actor.setSex("whiteSex");
  }

  @Override
  public void buildHand() {
    actor.setHand("whiteHand");
  }

  @Override
  public void buildEye() {
    actor.setEye("whiteEye");
  }
}
