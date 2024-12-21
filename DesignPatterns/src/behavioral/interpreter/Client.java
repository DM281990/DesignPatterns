package behavioral.interpreter;

import behavioral.interpreter.impl.AdditionExpression;
import behavioral.interpreter.impl.MultiplicationExpression;
import behavioral.interpreter.impl.NumberTerminalExpression;
import behavioral.interpreter.impl.SubtractionExpression;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.add("a", 2);
        context.add("b", 3);
        context.add("c", 4);
        context.add("d", 5);
        AbstractExpression expression = new MultiplicationExpression(
                new SubtractionExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new AdditionExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        expression.interprete(context);
    }
}
