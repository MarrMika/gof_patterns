package behavioural.visitor;


public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Monitor(), new Mouse(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
