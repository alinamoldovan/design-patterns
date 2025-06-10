package abstractf.factory.button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button created.");
    }

    // Additional methods specific to WindowsButton can be added here

}
