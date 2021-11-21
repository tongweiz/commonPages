package SimpleFac;

public class ChartFactory {
  public static Chart getChart(String type) {
    Chart chart = null;
    if(type.equalsIgnoreCase("bar")) {
      chart = new BarChart();
      System.out.println("initial bar chart!");
    }
    else if (type.equalsIgnoreCase("pie")) {
      chart = new PieChart();
      System.out.println("initial pie chart!");
    }
    else if (type.equalsIgnoreCase("line")) {
      chart = new LineChart();
      System.out.println("initial line chart!");
    }
    return chart;
  }
}