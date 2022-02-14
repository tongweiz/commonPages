package Creational.Prototype;

import lombok.Data;

@Data
public class WeeklyLog implements Cloneable {

  private String name;
  private String gender;
  private String content;

  public WeeklyLog clone() {
    Object obj = null;
    try {
      obj = super.clone();
      return (WeeklyLog) obj;
    } catch (CloneNotSupportedException e) {
      System.out.println("CLone not support");
      return null;
    }
  }
}
