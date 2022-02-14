package Creational.Prototype.PrototypeManager;

public class SAR implements OfficeDocs {
  @Override
  public OfficeDocs clone() {
    OfficeDocs sar = null;
    try {
      sar = (OfficeDocs) super.clone();
    } catch (Exception e) {
      System.out.println("Clone not support");
    }
    return sar;
  }

  @Override
  public void display() {
    System.out.println("Show SAR docs");
  }
}
