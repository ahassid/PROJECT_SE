package Primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    public void compareTo() {
        System.out.println("compareTo");
        Coordinate a = new Coordinate(1);
        Coordinate b = new Coordinate(2);
        int z = a.compareTo(b);
        assertEquals(z, 1, 0.01);
    }


    @Test
    void add() {
        System.out.println("add");
        Coordinate a = new Coordinate();
        Coordinate b = new Coordinate(10);
        a.add(b);
        assertEquals(a.get_coordinate(), b.get_coordinate(), 0.01);
    }

    @Test
    void subtract() {
        System.out.println("subtract");
        Coordinate a = new Coordinate();
        Coordinate b = new Coordinate(20);
        a.subtract(b);
        assertEquals(-a.get_coordinate(), b.get_coordinate(), 0.01);
    }
}