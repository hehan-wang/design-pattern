package com.david.pattern.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawAll();
    }
}
