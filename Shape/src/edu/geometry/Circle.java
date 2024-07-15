package edu.geometry;

public class Circle implements Shape {
    // private fields
    private double radius;

    // constructors
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // action methods
    @Override // method from interface Shape
    public double getArea() {
        double area = Math.PI * getRadius() * getRadius();
        return area; // circle's area = pi (Math.PI) * radius * radius
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * getRadius();
        return perimeter;
    }

    // immutable: getters (no setters)
    public double getRadius() {
        return radius;
    }

    public String toString() {
        return getClass().getSimpleName() + ": radius=" + getRadius() +
                ", area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}