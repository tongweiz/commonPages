package Creational.AbsFactory;

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
      DocumentBuilder builder = dFactory.newDocumentBuilder();
      Document doc;
      doc = builder.parse(new File("Creational/AbsFactory/config.xml"));

      NodeList nl = doc.getElementsByTagName("facName");
      Node cNode = nl.item(0).getFirstChild();
      String cName = cNode.getNodeValue();
      Class c = Class.forName(cName);
      Object obj = c.newInstance();
      return obj;
    }
    catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
