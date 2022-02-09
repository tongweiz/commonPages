package Creational.SimpleFac;

public class ChartTwo implements Chart {
  public ChartTwo () {
    System.out.println("Create Chart Two");
  }

  @Override
  public void show() {
    System.out.println("Show Chart Two");
  }
}
