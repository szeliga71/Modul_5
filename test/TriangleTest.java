import Zad3Zad4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {


    @Test
    public void triangleAreaTest(){
        Triangle tr=new Triangle(6,2);

        Assertions.assertEquals(6,tr.calculateArea());
    }
    @Test
    public void triangleAreaNegatibeSideTest(){
        Triangle tr=new Triangle(-6,2);

        Assertions.assertEquals(0,tr.calculateArea());
    }
    @Test
    public void triangleAreaNegativeHeigthTest(){
        Triangle tr=new Triangle(6,-2);

        Assertions.assertEquals(0,tr.calculateArea());
    }
    @Test
    public void triangleAreaNegativeSideAndHeightTest(){
        Triangle tr=new Triangle(-6,-2);

        Assertions.assertEquals(0,tr.calculateArea());
    }
    @Test
    public void triangleAreaSideZeroTest(){
        Triangle tr=new Triangle(0,2);

        Assertions.assertNotEquals(6,tr.calculateArea());
    }
    @Test
    public void triangleAreaHeigthZeroTest(){
        Triangle tr=new Triangle(6,0);

        Assertions.assertNotEquals(6,tr.calculateArea());
    }
    @Test
    public void triangleAreaSideAndHeigthZeroTest(){
        Triangle tr=new Triangle(0,0);

        Assertions.assertEquals(0,tr.calculateArea());
    }
}
