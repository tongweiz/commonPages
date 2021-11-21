package SimpleFac;

public class BarChart implements Chart {

  public BarChart() {
    System.out.println("Create bar chart!");
  }

  @Override
  public void display() {
    System.out.println("Show bar chart!");
  }
}
