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
       if(naturalNumbersParametersSideA(side)){
           return 0;}
        else if(naturalNumbersParametersHeigth(height)){
            return 0;}
        else{
        return (side * height) / 2;
    }
    }
}
