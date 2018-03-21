package Primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Point3DTest {

    @Test
    void compareTo() {
        System.out.println("compareTo");

        Point3D p1 = new Point3D(7,2.3,4.2);
        Point3D p2 = new Point3D(7,2.3,4.2);
        Point3D p3 = new Point3D(2.3,7,4.2);
        Point3D p4 = new Point3D(7,2.3,4.1);
        Point3D p5 = new Point3D(7,-2.3,4.1);

        int result = p1.compareTo(p2);
        assertEquals(result, 0);

        result = p3.compareTo(p2);
        assertEquals(1, result);

        result = p4.compareTo(p5);
        assertEquals(1, result);

        result = p2.compareTo(p4);
        assertEquals(1, result);
    }

    @Test
    void toStringtest() {
        System.out.println("toString");

        Point3D p = new Point3D(1, 2, 3);
        assertEquals("the coordinates are: x = 1.00, y = 2.00, z =  3.00", p.toString());
        // assertFalse("the coordinates are: x = 1.00 y = 2.00, z =  3.00" == p.toString());
        // assertFalse("the coordinates are: x = 1.00, y = 2.0, z =  3.00" == p.toString());
    }

    @Test
    void add() {
        System.out.println("add");

        Vector v = new Vector();
        Vector v2 = new Vector(-5, 3, -4);
        Point3D p = new Point3D();

        p.add(v);
        assertEquals(p.compareTo(v.getHead()), 0);
        p.add(v2);
        assertEquals(p.compareTo(v2.getHead()), 0);
        // assertFalse(p == new Vector(new Point3D(5, 3, -4)).getHead());
        // assertFalse(p == new Vector(new Point3D(-5.01, 3, -4)).getHead());
    }

    @Test
    void subtract() {
        System.out.println("subtract");

        Point3D p = new Point3D();
        Vector v = new Vector(1.5,-2,3);

        p.subtract(v);
        assertEquals(p.compareTo(new Point3D(-1.5, 2, -3)), 0);
    }

    @Test
    void distance() {
        System.out.println("distance");

        Point3D p1 = new Point3D(-5, 7.2, -3.4);
        Point3D p2 = new Point3D(1, 2.9, -6);
        double d = p1.distance(p2); // Distance Between p1 & p2

        assertEquals(d, Math.abs(Math.sqrt (Math.pow(-6, 2) + Math.pow(4.3, 2) + Math.pow(2.6, 2))), 0.01 );
        assertEquals(d, Math.abs(Math.sqrt (Math.pow(6, 2) + Math.pow(-4.3, 2) + Math.pow(2.6, 2))), 0.01 );
        // assertFalse(d == Math.abs(Math.sqrt (Math.pow(6.1, 2) + Math.pow(-4.3, 2) + Math.pow(2.6, 2))) );
    }
}