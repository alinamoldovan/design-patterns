package abstractf.factory.factories;

import abstractf.factory.button.Button;
import abstractf.factory.button.WindowsButton;
import abstractf.factory.checkbox.CheckBox;
import abstractf.factory.checkbox.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    // Additional methods specific to WindowsGUIFactory can be added here

}
