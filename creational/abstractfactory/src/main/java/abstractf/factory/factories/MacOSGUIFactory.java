package abstractf.factory.factories;

import abstractf.factory.button.Button;
import abstractf.factory.button.MacOSButton;
import abstractf.factory.checkbox.CheckBox;
import abstractf.factory.checkbox.MacOSCheckBox;

public class MacOSGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

    // Additional methods specific to MacOSGUIFactory can be added here

}
