package componentdemos.sliderdemos;

import java.util.Map;
import static java.util.Map.entry;
import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.text.Label;
import org.dwcj.component.window.Frame;
import org.dwcj.exceptions.DwcjException;
import org.dwcj.component.slider.Slider;

@InlineStyleSheet("context://css/sliderstyles/inversion_styles.css")
public class SliderInversionDemo extends App {
	
	Slider sl1 = new Slider();
	Slider sl2 = new Slider();

  @Override
  public void run() throws DwcjException {
    Frame window = new Frame();
    window.addClassName("Frame");

    Map<Integer, String> mapMatch = Map.ofEntries(
        entry(0, "0"),
        entry(50, "50"),
        entry(100, "100"));

    sl1.setMaximum(100).setMinimum(0);
    sl2.setMaximum(100).setMinimum(0);

    window.add(new Label("<html><b>Original:</b></html>"), sl1,
        new Label("<html><b>Inverted:</b></html>"), sl2);

    sl1.setPaintTicks(true)
        .setMinorTickSpacing(10)
        .setPaintLabels(true)
        .setLabels(mapMatch);

    sl2.setPaintTicks(true)
        .setMinorTickSpacing(10)
        .setPaintLabels(true)
        .setLabels(mapMatch)
        .setAttribute("inverted", "true");
  }
}
