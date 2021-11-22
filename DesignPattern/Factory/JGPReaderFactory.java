package Factory;

public class JGPReaderFactory implements ReaderFactory{
  @Override
  public PicReader createPicRead() {
    PicReader reader = new JPGReader();
    return reader;
  }
}
