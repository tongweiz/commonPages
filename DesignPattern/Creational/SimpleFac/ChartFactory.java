package Creational.SimpleFac;

public class ChartFactory {
  public static Chart getChart(String type) {
    Chart chart = null;
    if(type.equalsIgnoreCase("chartone")){
      chart = new ChartOne();
      System.out.println("Initial chart one");
    } else if (type.equalsIgnoreCase("chartwo")) {
      chart = new ChartTwo();
      System.out.println("Initial chart two");
    } else if (type.equalsIgnoreCase("chartthree")) {
      chart = new ChartTwo();
      System.out.println("Initial chart three");
    }
    return chart;
  }
}
