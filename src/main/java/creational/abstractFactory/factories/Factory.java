package creational.abstractFactory.factories;

import creational.abstractFactory.buttons.Button;
import creational.abstractFactory.checkboxes.CheckBox;

public interface Factory {
    Button createButton();
    CheckBox createCheckBox();
}
