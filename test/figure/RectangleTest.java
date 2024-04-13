package figure;

import Zad3Zad4.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    private double sideA = 0;
    private double sideB = 5;

    Rectangle rc = new Rectangle(sideA, sideB);

    @Test
    public void areaCalculateTest() {

        Rectangle rc = new Rectangle(6, 5);
        Assertions.assertEquals(30, rc.calculateArea());
    }

    @Test
    public void areaCalculateBothSideNegativeTest() {

        Rectangle rc = new Rectangle(-6, -5);
        Assertions.assertEquals(0, rc.calculateArea());
    }

    @Test
    public void areaCalculateOneSideNegativeTest() {

        Rectangle rc = new Rectangle(-6, 5);
        Assertions.assertEquals(0, rc.calculateArea());
    }

    @Test
    public void areaCalculateBothSideZeroTest() {

        Rectangle rc = new Rectangle(0, 0);
        Assertions.assertEquals(0, rc.calculateArea());
    }

    @Test
    public void areaCalculateOneSideZeroTest() {

        Rectangle rc = new Rectangle(0, 15);
        Assertions.assertEquals(0, rc.calculateArea());
    }
}
