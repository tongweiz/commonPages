package Creational.Prototype.PrototypeManager;

import java.util.Hashtable;

public class PrototypeManger {
  private Hashtable<String,OfficeDocs> ht = new Hashtable<>();
  private static PrototypeManger pm = new PrototypeManger();

  private PrototypeManger() {
    ht.put("FAR", new FAR());
    ht.put("SAR", new SAR());
  }

  public void addOfficeDocs(String type, OfficeDocs ods) {
    ht.put(type, ods);
  }

  public OfficeDocs getOfficeDocs(String type) {
    return ((OfficeDocs) ht.get(type)).clone();
  }

  public static PrototypeManger getProtoManger() {
    return pm;
  }
}
