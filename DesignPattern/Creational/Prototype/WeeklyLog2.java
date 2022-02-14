package Creational.Prototype;

import lombok.Data;

import java.io.*;

@Data
public class WeeklyLog2 implements Serializable {

  private Attachment at1;
  private String name;
  private String gender;
  private String content;

  public WeeklyLog2 deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bao);
    oos.writeObject(this);

    ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bai);
    return (WeeklyLog2) ois.readObject();
  }
}
