package creational.abstractFactory.factories;

import creational.abstractFactory.buttons.Button;
import creational.abstractFactory.buttons.MacOSButton;
import creational.abstractFactory.checkboxes.CheckBox;
import creational.abstractFactory.checkboxes.MacOSCheckBox;

public class MacOSFactory implements Factory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
