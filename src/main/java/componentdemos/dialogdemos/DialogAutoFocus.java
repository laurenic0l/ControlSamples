package componentdemos.dialogdemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.dialog.Dialog;
import org.dwcj.component.window.Frame;
import org.dwcj.component.maskedtextfield.MaskedTextField;
import org.dwcj.component.texts.Label;
import org.dwcj.exceptions.DwcjException;

@InlineStyleSheet("context://css/dialogstyles/dialog_styles.css")
public class DialogAutoFocus extends App {
  @Override
  public void run() throws DwcjException {
    Frame p = new Frame();
    Dialog dialog = new Dialog();
    p.add(dialog);

    dialog.getHeader().add(new Label("Auto Focus"));
    dialog.getContent().add(new MaskedTextField().setAttribute("label", "This Box is Auto Focused"));

    dialog.show();
    dialog.setAutoFocus(true);
  }
}