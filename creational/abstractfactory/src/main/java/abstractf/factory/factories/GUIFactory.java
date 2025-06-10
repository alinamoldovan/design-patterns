package abstractf.factory.factories;

import abstractf.factory.button.Button;
import abstractf.factory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();

}
