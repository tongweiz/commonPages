package Structural.Bridge;

public class PNGImage extends Image {
  @Override
  void parseFile(String fileName) {
    Matrix m = new Matrix();
    imp.doPaint(m);
    System.out.println("Filename is " + fileName);
  }
}
