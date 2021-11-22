package Factory;

public class GIFReader implements PicReader{
  @Override
  public void readPic() {
    System.out.println("Read GIF picture");
  }
}
