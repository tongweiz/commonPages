package Creational.SimpleFac;

public class ChartOne implements Chart {
  public ChartOne() {
    System.out.println("Create Chart One");
  }

  @Override
  public void show() {
    System.out.println("Show Chart One");
  }
}
