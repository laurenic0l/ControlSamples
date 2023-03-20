package control_demos.textboxdemos;

import org.dwcj.App;
import org.dwcj.annotations.InlineStyleSheet;
import org.dwcj.controls.panels.AppPanel;
import org.dwcj.controls.textbox.TextBox;
import org.dwcj.exceptions.DwcException;

@InlineStyleSheet("context://css/textboxstyles/text_box_styles.css")
public class TextBoxLabel extends App {
  @Override
  public void run() throws DwcException {
    AppPanel panel = new AppPanel();
    panel.addClassName("appPanel");

    TextBox t1 = new TextBox().setAttribute("label", "Example Label");
    panel.add(t1);
  }
}