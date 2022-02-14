package Creational.Prototype.PrototypeManager;

// Prototype manager
public class Client {
  public static void main(String[] args) {
    PrototypeManger pm = PrototypeManger.getProtoManger();
    OfficeDocs od1, od2;
    od1 = pm.getOfficeDocs("FAR");
    od1.display();
    od2 = pm.getOfficeDocs("FAR");
    od2.display();
    System.out.println(od1==od2);
  }
}
