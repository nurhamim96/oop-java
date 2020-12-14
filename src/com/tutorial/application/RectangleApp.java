package com.tutorial.application;

import com.tutorial.data.Rectangle;
import com.tutorial.data.Shape;

public class RectangleApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());
        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
