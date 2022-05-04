package Structural.Bridge;

public class WindowsImp implements ImageImp {
  @Override
  public void doPaint(Matrix m) {
    System.out.println("Show Image on Windows");
  }
}
