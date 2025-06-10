package abstractf;

import abstractf.factory.button.Button;
import abstractf.factory.checkbox.CheckBox;
import abstractf.factory.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    
    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
