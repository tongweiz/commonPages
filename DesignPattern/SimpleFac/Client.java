package SimpleFac;

import java.util.List;
import java.util.Optional;

public class Client {
  public static void main(String[] args) {
    Chart chart;
    List<String> type = XMLUtil.getChartType();
    for(String singleType : type) {
      chart = ChartFactory.getChart(singleType);
      chart.display();
    }
  }
}