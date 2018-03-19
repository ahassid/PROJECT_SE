package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;

public class Cylinder {
    private Point3D _axisPoint;
    private Vector _axisDirection;

    // ***************** Constructors ********************** //

    public Cylinder() {
        _axisPoint = new Point3D();
        _axisDirection = new Vector();
    }

    public Cylinder(Cylinder cylinder) {
        _axisPoint = cylinder._axisPoint;
        _axisDirection = cylinder._axisDirection;
    }

    public Cylinder(double radius, Point3D axisPoint, Vector axisDirection) {
        _axisPoint = axisPoint;
        _axisDirection = axisDirection;
    }

    // ***************** Getters/Setters ********************** //

    public Point3D get_axisPoint() {
        return _axisPoint;
    }

    public void set_axisPoint(Point3D _axisPoint) {
        this._axisPoint = _axisPoint;
    }

    public Vector get_axisDirection() {
        return _axisDirection;
    }

    public void set_axisDirection(Vector _axisDirection) {
        this._axisDirection = _axisDirection;
    }

    // ***************** Operations ******************** //
    public List<Point3D> FindIntersections(Ray ray) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }

    public Vector getNormal(Point3D point) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }
}
