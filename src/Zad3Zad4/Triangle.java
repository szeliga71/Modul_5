package Zad3Zad4;

public class Triangle extends Figure {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        if (isNaturalNumbersParameter(side)) {
            return 0;
        } else if (isNaturalNumbersParameter(height)) {
            return 0;
        } else {
            return (side * height) / 2;
        }
    }
}
