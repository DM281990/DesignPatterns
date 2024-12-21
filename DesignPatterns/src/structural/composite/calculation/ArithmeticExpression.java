package structural.composite.calculation;

public class ArithmeticExpression {
    public ArithmeticExpression leftExpression;
    public ArithmeticExpression rightExpression;
    public Operator operation;

    public ArithmeticExpression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operator operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public int evaluate() {
        switch (operation) {
            case ADD:
                return leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT:
                return leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY:
                return leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE:
                return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return 0;
    }
}
