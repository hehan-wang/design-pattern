package com.david.pattern.structural.decorator;

public class ReadShape extends ShapeDecorator {
    public ReadShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setColor();
        super.draw();
    }

    public void setColor() {
        System.out.println("Shape Color: Red");
    }
}
