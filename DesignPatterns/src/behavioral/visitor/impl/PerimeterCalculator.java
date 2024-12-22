package behavioral.visitor.impl;

import behavioral.visitor.ShapeVisitor;
import behavioral.visitor.shape.impl.Circle;
import behavioral.visitor.shape.impl.Square;
import behavioral.visitor.shape.impl.Triangle;

public class PerimeterCalculator implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        // Calculate area of circle and update totalArea
       System.out.println( 2*Math.PI * circle.radiusOfCircle);
    }

   @Override
    public void visit(Square square) {
        // Calculate area of square and update totalArea
       System.out.println( 4*square.sideOfSquare);
    }

    @Override
    public void visit(Triangle triangle) {
        // Calculate area of triangle and update totalArea
        System.out.println( 3*triangle.baseOfTriangle);
    }

}