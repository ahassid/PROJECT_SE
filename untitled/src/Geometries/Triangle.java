package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;

public class Triangle extends RadialGeometry {
    private Point3D _p1;
    private Point3D _p2;
    private Point3D _p3;

    // ***************** Constructors ********************** //

// FUNCTION
//   Triangle
// PARAMETERS
//   none
// RETURN VALUE
// none
// MEANING
// This functions builds a Triangle

    public Triangle(){
        _p1 = new Point3D();
        _p2 = new Point3D();
        _p3 = new Point3D();
    }

    // FUNCTION
//   Triangle
// PARAMETERS
//   triangle
// RETURN VALUE
// none
// MEANING
// This functions builds a Triangle. It gets a Triangle and copy it

    public Triangle(Triangle triangle){
        _p1 = triangle._p1;
        _p2 = triangle._p2;
        _p3 = triangle._p3;
    }

    // FUNCTION
//   Triangle
// PARAMETERS
//   3 Point3D
// RETURN VALUE
// none
// MEANING
// This functions builds a Triangle. It gets a 3 Point3D and use their values to create a Triangle

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        _p1 = p1;
        _p2 = p2;
        _p3 = p3;
    }

    // GET & SET Funcs

    // FUNCTION
//   get_p1
// PARAMETERS
//   none
// RETURN VALUE
// Point3D
// MEANING
// This functions returns a Point3D so that we can use it(because it's protection)

    public Point3D get_p1() {
        return _p1;
    }

    // FUNCTION
//   set_p1
// PARAMETERS
//   Point3D
// RETURN VALUE
// none
// MEANING
// This functions gets a Point3D and copy it's value to one of the point3D of the Triangle

    public void set_p1(Point3D _p1) {
        this._p1 = _p1;
    }

    // FUNCTION
//   get_p2
// PARAMETERS
//   none
// RETURN VALUE
// Point3D
// MEANING
// This functions returns a Point3D so that we can use it(because it's protection)

    public Point3D get_p2() {
        return _p2;
    }

    // FUNCTION
//   set_p2
// PARAMETERS
//   Point3D
// RETURN VALUE
// none
// MEANING
// This functions gets a Point3D and copy it's value to one of the point3D of the Triangle

    public void set_p2(Point3D _p2) {
        this._p2 = _p2;
    }

    // FUNCTION
//   get_p3
// PARAMETERS
//   none
// RETURN VALUE
// Point3D
// MEANING
// This functions returns a Point3D so that we can use it(because it's protection)

    public Point3D get_p3() {
        return _p3;
    }

    // FUNCTION
//   set_p3
// PARAMETERS
//   Point3D
// RETURN VALUE
// none
// MEANING
// This functions gets a Point3D and copy it's value to one of the point3D of the Triangle

    public void set_p3(Point3D _p3) {
        this._p3 = _p3;
    }

    // ***************** Operations ******************** //

    // FUNCTION
//   getNormal
// PARAMETERS
//   Point3D
// RETURN VALUE
// Vector
// MEANING
// This functions gets a Point3D and returns the normal of the Triangle

    public Vector getNormal(Point3D point) {
        double x1 = this._p1.getX().get_coordinate(); // First Vector X Coordinate
        double y1 = this._p1.getY().get_coordinate(); // First Vector Y Coordinate
        double z1 = this._p1.getZ().get_coordinate(); // First Vector Z Coordinate
        double x2 = point.getX().get_coordinate(); // Second Vector X Coordinate
        double y2 = point.getY().get_coordinate(); // Second Vector Y Coordinate
        double z2 = point.getZ().get_coordinate(); // Second Vector Z Coordinate

        Vector v = new Vector(y1 * z2 - y2 * z1, z1 * x2 - x1 * z2, x1 * y2 - x2 * y1);
        return v;
    }
    public List<Point3D> FindIntersections(Ray ray) {
        return null;
    }
}
