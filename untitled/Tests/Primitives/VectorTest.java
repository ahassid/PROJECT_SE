package Primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void add() {
        System.out.println("add");

        Vector v = new Vector(1, 2, 3);
        Vector v2 = new Vector();
        Vector v3 = new Vector(2, 0, 3);
        v.add(v2);
        v3.add(v);

        assertEquals(v.getHead().compareTo(new Point3D(1, 2, 3)), 0);
        assertEquals(v3.getHead().compareTo(new Point3D(3, 2, 6)), 0);
        assertEquals(v.getHead().compareTo(new Point3D(-1, 2, 3)), 1);
    }

    @Test
    void subtract() {
        System.out.println("subtract");

        Vector v = new Vector(2.5, 1.5, -4);
        Vector v2 = new Vector();
        Vector v3 = new Vector(-1, 3, 0);
        v.subtract(v2);
        v3.subtract(v);

        assertEquals(v.getHead().compareTo(new Point3D(2.5, 1.5, -4)), 0);
        assertEquals(v3.getHead().compareTo(new Point3D(-3.5, 1.5, 4)), 0);
        assertEquals(v3.getHead().compareTo(new Point3D(-3.5, 1.52, 4)), 1);
    }

    @Test
    void scale() {
        System.out.println("scale");

        Vector v = new Vector();
        Vector v2 = new Vector(1, 2.5, -3);
        Vector v3 = new Vector(9, -7.82, 6.95);
        double d = 0;
        double d2 = 2;
        double d3 = -1;

        v.scale(d2);
        v3.scale(d);
        v2.scale(d3);

        assertEquals(v.getHead().compareTo(new Point3D()), 0);
        assertEquals(v3.getHead().compareTo(new Point3D()), 0);
        assertEquals(v2.getHead().compareTo(new Point3D(-1, -2.5, 3)), 0);
        assertEquals(v2.getHead().compareTo(new Point3D()), 1);

    }

    @Test
    void crossProduct() {
        System.out.println("crossProduct");

        Vector v = new Vector(1, 2, -3);
        Vector v2 = new Vector(2, 4, -6);
        Vector v3 = new Vector(0, -2, 1.5);

        Vector n = new Vector(v.crossProduct(v2));
        assertEquals(n.getHead().compareTo(new Point3D()), 0);
        n = new Vector(v.crossProduct(v3));
        assertEquals(n.getHead().compareTo(new Point3D(-3, -1.5, 2)), 1);
        assertEquals(n.getHead().compareTo(new Point3D(-3, -1.5, -2)), 0);
    }

    @Test
    void length() {
        System.out.println("length");

        Vector v = new Vector();
        double d = v.length();
        assertEquals(d, 0, 0.01);

        v.setHead(new Point3D(1, -2, 3));
        d = v.length();
        assertEquals(d, Math.abs(Math.sqrt(14)), 0.01);
        assertEquals(d, Math.abs(Math.sqrt(14.3)), 0.1);
    }

    @Test
    void normalize() {
        System.out.println("normalize");

        Vector v = new Vector(1, 2, 1);
        v.normalize();
        double d = Math.abs(Math.sqrt(6));
        assertEquals(v.getHead().compareTo(new Point3D(1/d, 2/d, 1/d)), 0);
        assertEquals(v.getHead().compareTo(new Point3D(1/d, 2/d, 1.1/d)), 1);
    }

    @Test
    void dotProduct() {
        System.out.println("dotProduct");

        Vector v = new Vector(2, 4, 0);
        Vector v2 = new Vector(2, 4, -6);
        Vector v3 = new Vector(0, -2, 1.5);

        double n = v.dotProduct(v2);
        assertEquals(n, 20, 0.001);
        n = v3.dotProduct(v);
        assertEquals(n, -8, 0.001);
    }
}