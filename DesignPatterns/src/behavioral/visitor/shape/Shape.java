package behavioral.visitor.shape;

import behavioral.visitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}