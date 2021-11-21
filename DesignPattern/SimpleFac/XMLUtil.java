package SimpleFac;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {
  public static List<String> getChartType() {
    DocumentBuilderFactory dFactory = new DocumentBuilderFactoryImpl();
    try {
      List<String> nlString = new ArrayList<>();
      DocumentBuilder builder = dFactory.newDocumentBuilder();
      Document doc;
      doc = builder.parse(new File("SimpleFac/config.xml"));

      NodeList nl = doc.getElementsByTagName("chartType");

      for(int i=0; i<nl.getLength(); i++) {
        Node classNode = nl.item(i).getFirstChild();
        nlString.add(classNode.getNodeValue().trim());
      }

      return nlString;
    }
    catch(Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
