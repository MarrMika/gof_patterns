package creational.abstractFactory;

import creational.abstractFactory.buttons.Button;
import creational.abstractFactory.checkboxes.CheckBox;
import creational.abstractFactory.factories.Factory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(Factory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.print();
    }
}
