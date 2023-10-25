package componentdemos.comboboxdemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.component.window.Panel;
import org.dwcj.component.list.ChoiceBox;
import org.dwcj.exceptions.DwcjException;

@InlineStyleSheet("context://css/comboboxstyles/label_styles.css")
public class ComboboxLabelDemo extends App {
  @Override
  public void run() throws DwcjException {
    Frame window = new Frame();
    window.addClassName("Frame");

    ChoiceBox cb1 = new ChoiceBox();
    Panel container = new Panel().addClassName("container");
    window.add(container);

    cb1.add("Random Data1", "Random Data");
    cb1.add("Random Data2", "Some Data");
    cb1.add("Random Data3", "More Data");
    cb1.add("Random Data4", "Test Data");

    container.add(cb1);

        cb1.selectIndex(0)
        .setLabel("Example label");
  }
}
