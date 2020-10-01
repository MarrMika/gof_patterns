package behavioural.visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
}
