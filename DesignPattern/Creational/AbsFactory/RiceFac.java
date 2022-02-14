package Creational.AbsFactory;

public class RiceFac implements FoodFac{
  @Override
  public Meat createMeat() {
    return new RiceMeat();
  }

  @Override
  public Vege createVege() {
    return new RiceVege();
  }

  @Override
  public Drink createDrink() {
    return new RiceDrink();
  }
}
