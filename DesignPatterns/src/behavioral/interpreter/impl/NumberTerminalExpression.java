package behavioral.interpreter.impl;

import behavioral.interpreter.AbstractExpression;
import behavioral.interpreter.Context;

public class NumberTerminalExpression implements AbstractExpression {
    String stringVal;
    public NumberTerminalExpression(String stringVal){
        this.stringVal=stringVal;
    }
    @Override
    public int interprete(Context context) {
        return context.get(stringVal);
    }
}
