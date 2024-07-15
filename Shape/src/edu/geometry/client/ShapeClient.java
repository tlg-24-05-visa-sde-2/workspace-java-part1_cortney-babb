package edu.geometry.client;

import edu.geometry.*;


class ShapeClient {
    public static void main(String[] args) {

        ShapeArray shapeArray = new ShapeArray();

        System.out.println("Shapes using Interface: ");
        // adds new shape objects to array
        shapeArray.addShape(new Circle(4.5));
        shapeArray.addShape(new Circle(6.5));
        shapeArray.addShape(new Rectangle(12, 2));
        shapeArray.addShape(new Rectangle(24, 10.2));
        shapeArray.addShape(new Triangle(10, 13, 20));
        shapeArray.addShape(new Triangle(26, 18, 50));

        System.out.println();

        shapeArray.listShapes();


        System.out.println();
        System.out.printf("Total Area of Shapes: %.2f" , shapeArray.getTotalArea());

    }
}