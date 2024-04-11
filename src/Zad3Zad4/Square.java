package Zad3Zad4;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double calculateDiameter() {
        if(naturalNumbersParametersSideA(sideA)){
            return 0;}

        else{
        return 2 * (sideA + sideB);
    }
    }


}
