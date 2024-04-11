import Zad3Zad4.Rectangle;
import Zad3Zad4.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {





    @Test

    public void calculateSquareAreaTest(){

        Square sq1=new Square(4);

        Assertions.assertEquals(16,sq1.calculateArea());

    }
    @Test

    public void calculateSquareAreaSideZeroTest(){

        Square sq1=new Square(0);

        Assertions.assertEquals(0,sq1.calculateArea());

    }

    @Test

    public void calculateSquareAreaNegativeSideTest(){

        Square sq1=new Square(-5);
        Assertions.assertEquals(0,sq1.calculateArea());

    }
    @Test

    public void calculateSquareDiameterTest(){

        Square sq1=new Square(5);
        Assertions.assertEquals(20,sq1.calculateDiameter());
    }
    @Test

    public void calculateSquareDiameterSideZeroTest(){

        Square sq1=new Square(0);
        Assertions.assertEquals(0,sq1.calculateDiameter());
    }
    @Test

    public void calculateSquareDiameterSideNegativeTest(){
        Square sq1=new Square(-7);
        Assertions.assertEquals(0,sq1.calculateDiameter());
    }
}
