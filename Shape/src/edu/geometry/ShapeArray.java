package edu.geometry;

public class ShapeArray {

    // shapes array w/ default of 10
    private Shape[] shapes = new Shape[10];

    private int currentIndex = 0;

    // constructors
    public ShapeArray() {
    }

    // adds shapes to array and lists only the non-null indexes
    public void addShape(Shape shp) {
        if (currentIndex < shapes.length) {
            shapes[currentIndex++] = shp;
        }
    }

    // automatically calls toString() for each array index
    public void listShapes() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(shapes[i]);
        }
    }

    // returns current index if it is within actively filled array bounds
    public Shape shapeIndex(int index) {
        if (index >= 0 && index < currentIndex) {
            return shapes[index];
        } else {
            return null;
        }
    }

    // calculates the total area from each index
    public double getTotalArea() {
        double totalArea = 0.0;

        for (int i = 0; i < currentIndex; i++) {
            totalArea += shapes[i].getArea();
        }
        return totalArea;
    }
}