package behavioural.interpreter;

public class ExpressionEngine implements Expression {
    private String data;

    public ExpressionEngine(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        if (
          //      context.contains(data)
                data.toLowerCase().indexOf(context.toLowerCase()) != -1
        ){
            return true;
        }
        return false;
    }
}
