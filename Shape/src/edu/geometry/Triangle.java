package edu.geometry;

public class Triangle implements Shape {
    // private fields
    private double side1;
    private double side2;
//    private double side3;
    private double angle;

    // constructors
    public Triangle() {
    }

    // SAS
    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = Math.toRadians(angle); // converts number to radians
    }

    // SSS
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }

    // action method from interface Shape, SAS (side angle side)
    @Override
    public double getArea() {
        double area = 0.5 * side1 * side2 * Math.sin(angle);
        return area;
    }

    // side3= side1 * side1 + side2 * side2 -2 * side1 * side2 * cos(angle)
    // perimeter = side1 + side2 + side3
    @Override
    public double getPerimeter() {
        double side3Math = side1 * side1 + side2 * side2;
        double side3 = Math.sqrt(side3Math - 2 *
                        side1 * side2 * Math.cos(angle));
        double perimeter = side1 + side2 + side3;

        return perimeter;
    }


    // SSS: area = 0.25 × √( (a + b + c) × (-a + b + c) × (a - b + c) × (a + b - c) )
//    public double areaSss() {
//        double sssArea = 0.25 * Math.sqrt(side1 + side2 + side3) *
//                (-(side1) + side2 + side3) * (side1 - side2 + side3) *
//                (side1 + side2 - side3);
//        return sssArea;
//    }

    // immutable: getters (no setters)
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

//    public double getSide3() {
//        return side3;
//    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " side1=" + side1 +
                ", side2=" + side2 + ", angle=" + angle +
                " area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}