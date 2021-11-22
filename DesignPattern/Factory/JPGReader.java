package Factory;

public class JPGReader implements PicReader{

  @Override
  public void readPic() {
    System.out.println("Read JPG picture");
  }
}
