
import Zad3Zad4.Hexagon;
import Zad3Zad4.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {




    double sideA=2;
    double sideB=5;

    Rectangle rc =new Rectangle(sideA,sideB);

    @Test
    public void areaCalculate(){
        Assertions.assertEquals(10,rc.calculateArea());
    }
}
