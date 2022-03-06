package Structural.Adapter;

import org.w3c.dom.Document;
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
            doc = dBuilder.parse(new File("DesignPattern/Structural/Adapter/Config.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            String className = nl.item(0).getFirstChild().getNodeValue();
            Class c = Class.forName(className);
            return c.newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
