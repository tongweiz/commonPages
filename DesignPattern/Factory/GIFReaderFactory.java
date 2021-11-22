package Factory;

public class GIFReaderFactory implements ReaderFactory{
  @Override
  public PicReader createPicRead() {
    PicReader reader = new GIFReader();
      return reader;
  }
}
