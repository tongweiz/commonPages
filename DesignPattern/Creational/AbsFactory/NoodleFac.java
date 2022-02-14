package Creational.AbsFactory;

public class NoodleFac implements FoodFac {
  @Override
  public Meat createMeat() {
    return new NoodleMeat();
  }

  @Override
  public Vege createVege() {
    return new NoodleVege();
  }

  @Override
  public Drink createDrink() {
    return new NoodleDrink();
  }
}
