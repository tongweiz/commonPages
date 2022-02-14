package Creational.AbsFactory;

public class Client {
  public static void main(String[] args) {
    FoodFac fac;
    Meat meat;
    Vege vege;
    Drink drink;
    fac = (FoodFac) XMLUtil.getBean();
    meat = fac.createMeat();
    vege = fac.createVege();
    drink = fac.createDrink();
    meat.showMeat();
    vege.showVege();
    drink.showDrink();
  }
}
