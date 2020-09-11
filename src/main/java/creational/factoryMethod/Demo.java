package creational.factoryMethod;

import creational.factoryMethod.factory.Dialog;
import creational.factoryMethod.factory.HTMLDialog;
import creational.factoryMethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HTMLDialog();
        }

    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
