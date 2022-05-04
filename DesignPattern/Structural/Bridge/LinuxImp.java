package Structural.Bridge;

public class LinuxImp implements ImageImp {
  @Override
  public void doPaint(Matrix m) {
    System.out.println("Show Image on Linux");
  }
}
