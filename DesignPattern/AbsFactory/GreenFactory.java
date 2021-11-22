package AbsFactory;

public class GreenFactory implements SkinFactory{
  @Override
  public Button createButton() {
    return new GreenButton();
  }

  @Override
  public TextField createText() {
    return new GreenText();
  }

  @Override
  public ComboBox createComboBox() {
    return new GreenBox();
  }
}
