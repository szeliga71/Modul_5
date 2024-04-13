package Zad3Zad4;

public abstract class Figure implements GeometricFigure {

    public boolean isNaturalNumbersParameter(double elemenLength) {
        if (elemenLength <= 0) {
            return true;
        } else {
            return false;
        }
    }




}
