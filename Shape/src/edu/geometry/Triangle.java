package edu.geometry;

public class Triangle implements Shape {
    // private fields
    private double side1;
    private double side2;
    private double angle;

    // constructors
    public Triangle() {
    }

    // SAS
    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    // action method from interface Shape, SAS (side angle side)
    @Override
    public double getArea() {
        double a = Math.toRadians(angle); // converts number to radians
        double area = 0.5 * side1 * side2 * Math.sin(a);
        return area;
    }

    // Perimeter: side3= side1 * side1 + side2 * side2 -2 * side1 * side2 * cos(angle)
    // perimeter = side1 + side2 + side3
    @Override
    public double getPerimeter() {
        double a = Math.toRadians(angle);
        double side3Math = side1 * side1 + side2 * side2;
        double side3 = Math.sqrt(side3Math - 2 *
                        side1 * side2 * Math.cos(a));
        double perimeter = side1 + side2 + side3;

        return perimeter;
    }

    // SSS: area = SquareRoot of [ s(s−side1)(s−side2)(s−side3) ]
    public double areaSss() {
        double a = Math.toRadians(angle);
        double s = (side1 + side2 + angle) / 2;
        double sssAreaCalc = Math.sqrt(s * (s - side1) * (s - side2) * (s - a));
        return sssAreaCalc;
    }

    // immutable: getters (no setters)
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

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