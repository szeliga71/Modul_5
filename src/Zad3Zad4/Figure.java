package Zad3Zad4;

public abstract class Figure implements GeometricFigure {

    public boolean naturalNumbersParametersSideA(double sideA){
        if (sideA <= 0) {
            return true;
    }else{
        return false;
        }
    }

    public boolean naturalNumbersParametersSideB(double sideB){
        if (sideB <= 0) {
        return true;
    }else{
        return false;
    }
    }

    public boolean naturalNumbersParametersHeigth(double heigth){
        if (heigth<= 0) {
            return true;
        }else{
            return false;
        }
    }
}
