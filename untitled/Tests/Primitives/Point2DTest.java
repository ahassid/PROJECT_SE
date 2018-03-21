package Primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Point2DTest {

    @Test
    void compareTo() {
        System.out.println("compareTo");

        Coordinate c1 = new Coordinate(1.1);
        Coordinate c2 = new Coordinate(2.2);
        Point2D p1 = new Point2D(c1, c2);
        Point2D p2 = new Point2D(c2, c1);

        // Result Of The Equality
        int result = p1.compareTo(p2);
        assertEquals(result, 1);
    }
}