package Creational.Prototype.PrototypeManager;

public class FAR implements OfficeDocs {
  @Override
  public OfficeDocs clone() {
    OfficeDocs far = null;
    try {
      far = (OfficeDocs) super.clone();
    } catch (Exception e) {
      System.out.println("Clone not support");
    }
    return far;
  }

  @Override
  public void display() {
    System.out.println("Show FAR docs");
  }
}
