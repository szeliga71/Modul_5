package Zad3Zad4;

public class Rectangle extends Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {


            this.sideA = sideA;
            this.sideB = sideB;

    }


    @Override
    public double calculateArea() {
        if(naturalNumbersParametersSideA(sideA)){
            return 0;}
            else if(naturalNumbersParametersSideB(sideB)){
            return 0;
        }else{
            return sideA * sideB;
        }
    }

}
