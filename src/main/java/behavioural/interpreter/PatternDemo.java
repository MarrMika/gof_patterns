package behavioural.interpreter;

public class PatternDemo {

    public static Expression[] getContext(){
        Expression expression1 = new ExpressionEngine("I am a teacher!");
        Expression expression2 = new ExpressionEngine("I am a programmer and teacher!");
        return new Expression[]{expression1, expression2};
    }

    public static void main(String[] args) {
        Expression [] expressions = getContext();
        Expression orWhatDoYouDo = new OrExpression(expressions[0], expressions[1]);
        Expression andWhatDoYouDo = new AndExpression(expressions[0], expressions[1]);

        System.out.println("Are they both programmers? - " + orWhatDoYouDo.interpret("programmer"));
        System.out.println("Is only one of them a teacher? - " + andWhatDoYouDo.interpret("teacher"));
    }
}
