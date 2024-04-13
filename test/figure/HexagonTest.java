package figure;

import Zad3Zad4.Hexagon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HexagonTest {

   @Test
   public void hexagonAreaTest(){

       Hexagon hx=new Hexagon(4);
       Assertions.assertEquals(41.569219381653056,hx.calculateArea());
   }

    @Test
    public void hexagonAreaTest2(){

        Hexagon hx=new Hexagon(4);
        Assertions.assertNotEquals(41,hx.calculateArea());
    }
    @Test
    public void hexagonAreaNegativeSideTest(){

        Hexagon hx=new Hexagon(0);
        Assertions.assertEquals(0,hx.calculateArea());
    }
    @Test
    public void hexagonAreaZeroSideTest(){

        Hexagon hx=new Hexagon(0);
        Assertions.assertEquals(0,hx.calculateArea());
    }
}
