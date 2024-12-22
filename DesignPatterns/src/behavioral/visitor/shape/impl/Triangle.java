package behavioral.visitor.shape.impl;

import behavioral.visitor.ShapeVisitor;
import behavioral.visitor.shape.Shape;

public class Triangle implements Shape {
    public double baseOfTriangle;
    public double heightOfTriangle;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}