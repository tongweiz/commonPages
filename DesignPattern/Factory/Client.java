package Factory;

public class Client {
  public static void main(String[] args) {
    ReaderFactory factory;
    PicReader reader;
    factory = (ReaderFactory) XMLUtil.getBean();
    reader = factory.createPicRead();
    reader.readPic();
  }
}
