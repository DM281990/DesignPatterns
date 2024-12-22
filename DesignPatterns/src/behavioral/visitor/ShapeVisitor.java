package behavioral.visitor;

import behavioral.visitor.shape.impl.Circle;
import behavioral.visitor.shape.impl.Square;
import behavioral.visitor.shape.impl.Triangle;


public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);
}