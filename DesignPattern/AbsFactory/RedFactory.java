package AbsFactory;

public class RedFactory implements SkinFactory{
  @Override
  public Button createButton() {
    return new RedButton();
  }

  @Override
  public TextField createText() {
    return new RedText();
  }

  @Override
  public ComboBox createComboBox() {
    return new RedBox();
  }
}
