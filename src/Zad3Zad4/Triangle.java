package Zad3Zad4;

public class Triangle extends Figure {

    double side;
    double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (side*height)/2;
    }
}
