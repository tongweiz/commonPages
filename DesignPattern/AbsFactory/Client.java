package AbsFactory;

import javax.xml.soap.Text;

public class Client {
  public static void main(String[] args) {
    SkinFactory factory;
    Button bt;
    TextField tf;
    ComboBox cb;
    factory = (SkinFactory)XMLUtil.getBean();
    bt = factory.createButton();
    tf = factory.createText();
    cb = factory.createComboBox();
    bt.display();
    tf.display();
    cb.display();
  }
}
