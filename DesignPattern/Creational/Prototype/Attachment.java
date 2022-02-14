package Creational.Prototype;

import lombok.Data;

import java.io.Serializable;

@Data
public class Attachment implements Serializable {

  private String name;

  public void download() {
    System.out.println("Download File");
  }
}
