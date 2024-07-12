package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.ShapeArray;


class ShapeClient {
    public static void main(String[] args) {

        ShapeArray shapeArray = new ShapeArray();

        System.out.println("Shapes using Interface: ");
        // adds new shape objects to array
        shapeArray.addShape(new Circle(4.5));
        shapeArray.addShape(new Circle(6.5));
        shapeArray.addShape(new Rectangle(12, 2));
        shapeArray.addShape(new Rectangle(24, 10.2));

        System.out.println();

        shapeArray.listShapes();

        System.out.println();
        System.out.println("Total Area of Shapes: " + shapeArray.getTotalArea());

    }

}