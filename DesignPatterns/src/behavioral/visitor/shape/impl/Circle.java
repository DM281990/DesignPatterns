package behavioral.visitor.shape.impl;

import behavioral.visitor.ShapeVisitor;
import behavioral.visitor.shape.Shape;

public class Circle implements Shape {
    public double radiusOfCircle;
    // Circle specific properties and methods

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
