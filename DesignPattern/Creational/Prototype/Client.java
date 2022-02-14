package Creational.Prototype;

public class Client {
  public static void main(String[] args) {
    WeeklyLog log_one = new WeeklyLog();
    log_one.setName("Zhao");
    log_one.setGender("Man");
    log_one.setContent("Who am I");

    System.out.println(log_one.getName());
    System.out.println(log_one.getGender());
    System.out.println(log_one.getContent());

    WeeklyLog log_two = log_one.clone();
    log_two.setName("Qian");

    System.out.println(log_two.getName());
    System.out.println(log_two.getGender());
    System.out.println(log_two.getContent());

    System.out.println(log_one==log_two);
    System.out.println(log_one.getName()==log_two.getName());
    System.out.println(log_one.getGender()==log_two.getGender());
    System.out.println(log_one.getContent()==log_two.getContent());
  }
}
