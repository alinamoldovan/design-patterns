package abstractf;

import abstractf.factory.factories.GUIFactory;
import abstractf.factory.factories.MacOSGUIFactory;
import abstractf.factory.factories.WindowsGUIFactory;

public class DemoApplication {
/**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSGUIFactory();
        } else {
            factory = new WindowsGUIFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
