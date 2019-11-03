package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.display();
    }


    public abstract Button createButton();
}
