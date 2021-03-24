package com.david.pattern.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        cricle.draw();
        System.out.println("-------------------");
        ReadShape readCircle = new ReadShape(cricle);
        readCircle.draw();
        System.out.println("-------------------");
        Rectangle rectangle = new Rectangle();
        ReadShape readRectangle = new ReadShape(rectangle);
        readRectangle.draw();
    }
}
