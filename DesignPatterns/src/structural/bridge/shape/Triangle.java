package structural.bridge.shape;

import structural.bridge.Color;
import structural.bridge.Shape;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }
}
