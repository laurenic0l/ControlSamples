package componentdemos.numericboxdemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.exceptions.DwcjException;
import org.dwcj.component.maskednumberfield.MaskedNumberField;

@InlineStyleSheet("context://css/numericboxstyles/demo_styles.css")
public class NumericboxDemo extends App {

  MaskedNumberField nb= new MaskedNumberField();

  @Override
  public void run() throws DwcjException {
    Frame window = new Frame();
    window.addClassName("Frame");
    window.add(nb);
  }
}
