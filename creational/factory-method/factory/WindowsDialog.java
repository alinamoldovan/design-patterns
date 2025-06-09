public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    // Additional methods specific to WindowsDialog can be added here

}
