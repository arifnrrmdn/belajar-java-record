package arifunikom.records;

import arifunikom.records.annotation.Valid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    void compactConstructor() {

        var point = new Point(10, 10);
        assertEquals(10, point.x());
        assertEquals(10, point.y());

    }

    @Test
    void staticMember() {

        assertEquals(0, Point.ZERO.x());
        assertEquals(0, Point.ZERO.y());

        var point = Point.create(10, 10);
        assertEquals(10, point.x());
        assertEquals(10, point.y());

    }

    @Test
    void annotation() throws NoSuchFieldException, NoSuchMethodException {

        assertNotNull(Point.class.getDeclaredField("x").getAnnotations());
        assertNotNull(Point.class.getDeclaredField("y").getAnnotations());

        assertNotNull(Point.class.getDeclaredMethod("x").getAnnotations());
        assertNotNull(Point.class.getDeclaredMethod("y").getAnnotations());

        assertNotNull(Point.class.getConstructors()[0].getParameters()[0].getAnnotation(Valid.class));
        assertNotNull(Point.class.getConstructors()[0].getParameters()[1].getAnnotation(Valid.class));

    }
//    Cara Lama
//    public void printObject(Object object){
//        if(object instanceof Point){
//            Point point = (Point) object;
//            System.out.println(point.x());
//            System.out.println(point.y());
//        }else {
//            System.out.println(object);
//        }
//    }

    public void printObject(Object object){
        if(object instanceof Point(int x, int y)){
            Point point = (Point) object;
            System.out.println(x);
            System.out.println(y);
        }else {
            System.out.println(object);
        }
    }

    @Test
    void beforeRecordPatterns() {
        printObject(new Point(10,10));
    }
}
