package Zad3Zad4;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double calculateArea() {

        if  (isNaturalNumbersParameter(sideA)) {
            return 0;
        }
            else if(isNaturalNumbersParameter(sideB)){
            return 0;
        }else{
            return sideA * sideB;
        }
    }

}
