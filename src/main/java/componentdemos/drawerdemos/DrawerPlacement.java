package componentdemos.drawerdemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.list.ChoiceBox;
import org.dwcj.component.list.ComboBox;
import org.dwcj.component.drawer.Drawer;
import org.dwcj.component.drawer.Drawer.Placement;
import org.dwcj.component.window.Frame;
import org.dwcj.exceptions.DwcjException;

@InlineStyleSheet("context://css/drawerstyles/drawer_placement.css")
public class DrawerPlacement extends App {

  ComboBox placements;

  @Override
  public void run() throws DwcjException {

    Frame app = new Frame();
    Drawer drawer = new Drawer();
    placements = new ComboBox();

    app.add(drawer);
    drawer.open();
    drawer.getContent()
        .add(placements)
        .addClassName("drawer");

    for (Placement placement : Drawer.Placement.values()) {
      placements.add(placement,
          placement.toString().substring(0, 1).toUpperCase() + placement.toString().substring(1).toLowerCase());
    }

    placements.selectIndex(4);
    placements.onSelect(
        e -> {
          drawer.setPlacement((Placement) placements.getSelectedItem().getKey());
        });
  }

}
