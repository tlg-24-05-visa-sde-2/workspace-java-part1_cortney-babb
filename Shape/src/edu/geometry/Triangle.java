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
        double a = Math.toRadians(getAngle()); // converts number to radians
        double area = 0.5 * getSide1() * getSide2() * Math.sin(a);
        return area;
    }

    // Perimeter: side3= side1 * side1 + side2 * side2 -2 * side1 * side2 * cos(angle)
    // perimeter = side1 + side2 + side3
    @Override
    public double getPerimeter() {
        double a = Math.toRadians(getAngle());
        double side3Math = getSide1() * getSide1() + getSide2() * getSide2();
        double side3 = Math.sqrt(side3Math - 2 *
                        getSide1() * getSide2() * Math.cos(a));
        double perimeter = getSide1() + getSide2() + side3;

        return perimeter;
    }

    // SSS: area = SquareRoot of [ s(s−side1)(s−side2)(s−side3) ]
    public double areaSss() {
        double a = Math.toRadians(getAngle());
        double s = (getSide1() + getSide2() + getArea()) / 2;
        double sssAreaCalc = Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - a));
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
        return getClass().getSimpleName() + " side1=" + getSide1() +
                ", side2=" + getSide2() + ", angle=" + getAngle() +
                " area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}