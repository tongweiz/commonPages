package Structural.Bridge;

abstract class Image {
  protected ImageImp imp;

  public void setImageImp(ImageImp imp) {
    this.imp = imp;
  }

  abstract void parseFile(String fileName);
}
