package componentdemos.numericboxdemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.component.html.elements.Div;
import org.dwcj.exceptions.DwcjException;
import org.dwcj.component.maskednumberfield.MaskedNumberField;

@InlineStyleSheet("context://css/numericboxstyles/expanse_styles.css")
public class NumericboxExpanses extends App {
	
	 Div container = new Div();
	 MaskedNumberField nb1 = new MaskedNumberField();
	 MaskedNumberField nb2 = new MaskedNumberField();
	 MaskedNumberField nb3 = new MaskedNumberField();
	 MaskedNumberField nb4 = new MaskedNumberField();
	 MaskedNumberField nb5 = new MaskedNumberField();
	 
  @Override
  public void run() throws DwcjException {

    Frame window = new Frame();

    window.add(container);
    window.addClassName("Frame");
    container.addClassName("container");

    nb1.setExpanse(MaskedNumberField.Expanse.XSMALL)
        .setAttribute("label", "Extra Small")
        .setStyle("grid-column", "1");

    nb2.setExpanse(MaskedNumberField.Expanse.SMALL)
        .setAttribute("label", "Small")
        .setStyle("grid-column", "2");

    nb3.setExpanse(MaskedNumberField.Expanse.MEDIUM)
        .setAttribute("label", "Medium")
        .setStyle("grid-column", "3");

    nb4.setExpanse(MaskedNumberField.Expanse.LARGE)
        .setAttribute("label", "Large")
        .setStyle("grid-column", "1");

    nb5.setExpanse(MaskedNumberField.Expanse.XLARGE)
        .setAttribute("label", "Extra Large")
        .setStyle("grid-column", "3");

    container.add(nb1, nb2, nb3, nb4, nb5);
  }
}
