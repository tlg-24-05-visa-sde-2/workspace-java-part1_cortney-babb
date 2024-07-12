package edu.geometry;

public class Rectangle implements Shape {
    // private fields
    private double width;
    private double height;

    // constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // action method from interface Shape
    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    // immutable: getters (no setters)
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public String toString() {
        return getClass().getSimpleName() + ": width=" + width + ", height=" +
                         height + ", area=" + getArea();
    }

}