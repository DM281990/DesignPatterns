package behavioral.interpreter.impl;

import behavioral.interpreter.AbstractExpression;
import behavioral.interpreter.Context;

public class MultiplicationExpression implements AbstractExpression{
    AbstractExpression leftAbstractExpression;
    AbstractExpression rightAbstractExpression;
    public MultiplicationExpression(AbstractExpression leftAbstractExpression, AbstractExpression rightAbstractExpression) {
        this.leftAbstractExpression = leftAbstractExpression;
        this.rightAbstractExpression = rightAbstractExpression;
    }

    @Override
    public int interprete(Context context) {
        return leftAbstractExpression.interprete(context)*
                rightAbstractExpression.interprete(context);
    }

}
