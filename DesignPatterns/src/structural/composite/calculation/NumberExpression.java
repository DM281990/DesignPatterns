package structural.composite.calculation;

public class NumberExpression extends ArithmeticExpression{
    int val;
    NumberExpression(int val){
        super(null,null,null);
        this.val =val;
    }
    public int evaluate(){
        return val;
    }
}
