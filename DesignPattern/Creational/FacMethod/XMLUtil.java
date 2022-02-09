package Creational.FacMethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
  public static Object getBean() {
    try {
      DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
      Document doc;
      doc = dBuilder.parse(new File("Creational/FacMethod/config.xml"));

      NodeList nl = doc.getElementsByTagName("chartType");
      Node classNode = nl.item(0).getFirstChild();
      String cName = classNode.getNodeValue();

      Class c = Class.forName(cName);
      Object obj = c.newInstance();
      return  obj;
    } catch(Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
