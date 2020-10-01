package behavioural.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ComputerPart part = new Computer();
        part.accept(new ComputerPartDisplayVisitor());
    }
}
