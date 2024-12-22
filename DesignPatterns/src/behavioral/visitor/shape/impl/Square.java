package behavioral.visitor.shape.impl;

import behavioral.visitor.ShapeVisitor;
import behavioral.visitor.shape.Shape;

public class Square implements Shape {
    public double sideOfSquare;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}