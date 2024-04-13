package Zad3Zad4;

public class Hexagon extends Figure {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        if (isNaturalNumbersParameter(side)) {
            return 0;
        } else {
            return (3 * Math.pow(side, 2) * Math.sqrt(3)) / 2;
        }
    }
}
