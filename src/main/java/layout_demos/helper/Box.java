package layout_demos.helper;

import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.Composite;
import org.dwcj.component.html.elements.Div;
import org.dwcj.concern.HasStyle;
import org.dwcj.concern.HasVisibility;

@InlineStyleSheet("context://css/flexstyles/box_styles.css")
public class Box extends Composite<Div> implements HasStyle, HasVisibility{

  int num;
  String title = "";
  boolean vis = true;
  Div display = new Div();

  @Override
  protected void onDidCreate(Div container) {
    super.onDidCreate(container);
    
    if (title.isEmpty()) {
      title = "Box " + this.num;
    }
    display.setText(title);
    container.add(display);
    container.addClassName("demo__box");
  }

  public Box(int num) {
    this.num = num;
  }

  public Box(String title) {
    this.title = title;
  }

  public void setDisplay(String text) {
    this.title = text;
  }

  @Override
  public Box setStyle(String property, String value) {
    getBoundComponent().setStyle(property, value);
    return this;
  }

  public void boxDestroy() {
    getBoundComponent().destroy();
  }

  @Override
  public String getStyle(String property) {
    return getBoundComponent().getStyle(property);
  }

  @Override
  public String getComputedStyle(String property) {
    return getBoundComponent().getComputedStyle(property);
  }

  @Override
  public Box removeStyle(String property) {
    getBoundComponent().removeStyle(property);
    return this;
  }

  @Override
  public boolean isVisible() {
    return getBoundComponent().isVisible();
  }

  @Override
  public Box setVisible(boolean visible) {
    getBoundComponent().setVisible(visible);
    return this;
  }
}