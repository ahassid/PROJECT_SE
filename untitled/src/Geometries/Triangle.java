package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;

public class Triangle {
    private Point3D _p1;
    private Point3D _p2;
    private Point3D _p3;

    // ***************** Constructors ********************** //

    public Triangle(){
        _p1 = new Point3D();
        _p2 = new Point3D();
        _p3 = new Point3D();
    }

    public Triangle(Triangle triangle){
        _p1 = triangle._p1;
        _p2 = triangle._p2;
        _p3 = triangle._p3;
    }

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        _p1 = p1;
        _p2 = p2;
        _p3 = p3;
    }

    public Point3D get_p1() {
        return _p1;
    }

    public void set_p1(Point3D _p1) {
        this._p1 = _p1;
    }

    public Point3D get_p2() {
        return _p2;
    }

    public void set_p2(Point3D _p2) {
        this._p2 = _p2;
    }

    public Point3D get_p3() {
        return _p3;
    }

    public void set_p3(Point3D _p3) {
        this._p3 = _p3;
    }

    // ***************** Operations ******************** //
    public Vector getNormal(Point3D point) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }

    public List<Point3D> FindIntersections(Ray ray) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }
}
