package behavioral.visitor.impl;

import behavioral.visitor.ShapeVisitor;
import behavioral.visitor.shape.impl.Circle;
import behavioral.visitor.shape.impl.Square;
import behavioral.visitor.shape.impl.Triangle;

public class AreaCalculator implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        // Calculate area of circle and update totalArea
        System.out.println( Math.PI * Math.pow(circle.radiusOfCircle, 2));
    }

   @Override
    public void visit(Square square) {
        // Calculate area of square and update totalArea
       System.out.println(Math.pow(square.sideOfSquare, 2));
    }

    @Override
    public void visit(Triangle triangle) {
        // Calculate area of triangle and update totalArea
        System.out.println((triangle.baseOfTriangle * triangle.heightOfTriangle) / 2);
    }

}