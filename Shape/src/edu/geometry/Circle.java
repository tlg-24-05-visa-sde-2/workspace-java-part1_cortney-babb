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
        double area = Math.PI * radius * radius;
        return area; // circle's area = pi (Math.PI) * radius * radius
    }

    // immutable: getters (no setters)
    public double getRadius() {
        return radius;
    }

    public String toString() {
        return getClass().getSimpleName() + ": radius=" + radius + ", area=" + getArea();
    }
}