package Structural.Bridge;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
  public static Object getBean(String args) {
    try {
      DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = dFactory.newDocumentBuilder();
      Document doc;
      doc = builder.parse(new File("Structural/Bridge/Config.xml"));

      NodeList nl = null;
      Node classNode = null;
      String cName = null;
      nl = doc.getElementsByTagName("className");

      if (args.equals("image")) {
        classNode = nl.item(0).getFirstChild();
      } else if (args.equals("os")) {
        classNode = nl.item(1).getFirstChild();
      }

      cName = classNode.getNodeValue();
      Class c = Class.forName(cName);
      Object obj = c.newInstance();
      return obj;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
