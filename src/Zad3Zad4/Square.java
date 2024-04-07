package Zad3Zad4;

public class Square extends Rectangle {

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    public double calculateDiameter(){
        return 2*(sideA+sideB);
    }


}
