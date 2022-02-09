package Creational.SimpleFac;

public class Client {
  public static void main(String[] args) {
    Chart chart;
    String chartType = XMLUtil.getChartType();
    chart = ChartFactory.getChart(chartType);
    chart.show();
  }
}
