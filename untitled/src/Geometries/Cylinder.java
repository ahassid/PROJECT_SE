package Geometries;

import Primitives.Point3D;
import Primitives.Vector;
import Primitives.Ray;

import java.util.List;

public class Cylinder {
    private Point3D _axisPoint;
    private Vector _axisDirection;

    // ***************** Constructors ********************** //
    // FUNCTION
//   Cylinder
// PARAMETERS
//   none
// RETURN VALUE
// none
// MEANING
// This functions builds a Cylinder (Equals The vector to 0)

    public Cylinder() {
        _axisPoint = new Point3D();
        _axisDirection = new Vector();
    }
    // FUNCTION
//   Cylinder
// PARAMETERS
//  Cylinder
// RETURN VALUE
// none
// MEANING
// This functions builds a Cylinder. It gets a Cylinder and and make it's value to the itself Cylinder.

    public Cylinder(Cylinder cylinder) {
        _axisPoint = cylinder._axisPoint;
        _axisDirection = cylinder._axisDirection;
    }
    // FUNCTION
//   Cylinder
// PARAMETERS
//  double radius and Point3D axisPoint and Vector axisDirection
// RETURN VALUE
// none
// MEANING
// This functions builds a Cylinder. It gets a axisPoint and axisDirection and make it's value to the itself Cylinder.

    public Cylinder(double radius, Point3D axisPoint, Vector axisDirection) {
        _axisPoint = axisPoint;
        _axisDirection = axisDirection;
    }

    // ***************** Getters/Setters ********************** //
    // FUNCTION
//   get_axisPoint
// PARAMETERS
//   none
// RETURN VALUE
// _axisPoint
// MEANING
// This functions returns the _axisPoint of the Cylinder

    public Point3D get_axisPoint() {
        return _axisPoint;
    }

    // FUNCTION
//   set_axisPoint
// PARAMETERS
//  Point3D _axisPoint
// RETURN VALUE
// none
// MEANING
// This functions sets the _axisPoint of the Cylinder

    public void set_axisPoint(Point3D _axisPoint) {
        this._axisPoint = _axisPoint;
    }
    // FUNCTION
//   get_axisDirection
// PARAMETERS
//   none
// RETURN VALUE
// _axisDirection
// MEANING
// This functions returns the _axisDirection of the Cylinder

    public Vector get_axisDirection() {
        return _axisDirection;
    }
    // FUNCTION
//   set_axisDirection
// PARAMETERS
//  Vector _axisDirection
// RETURN VALUE
// none
// MEANING
// This functions sets the _axisDirection of the Cylinder

    public void set_axisDirection(Vector _axisDirection) {
        this._axisDirection = _axisDirection;
    }

    // ***************** Operations ******************** //
    // FUNCTION
//   FindIntersections
// PARAMETERS
//  Ray ray
// RETURN VALUE
// none
// MEANING
// This functions Find the Intersections of vector on view

    public List<Point3D> FindIntersections(Ray ray) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }
    // FUNCTION
//   getNormal
// PARAMETERS
//  Point3D point
// RETURN VALUE
// none
// MEANING
// This functions get the Normal from 2 vectors
    public Vector getNormal(Point3D point) {
        return null;
        // ?????? Have Not Done That Yet ??????????
    }
}
