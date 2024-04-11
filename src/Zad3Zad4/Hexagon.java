package Zad3Zad4;

public class Hexagon extends Figure {

    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        if (naturalNumbersParametersSideA(side)) {
            return 0;
        } else {
            return (3 * Math.pow(side, 2) * Math.sqrt(3)) / 2;
        }
    }
}
