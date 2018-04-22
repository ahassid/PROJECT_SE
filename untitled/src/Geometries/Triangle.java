package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.ArrayList;
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
        Vector u = new Vector(_p1,_p2);
        Vector v = new Vector(_p1,_p3);
        Vector n = new Vector(u.crossProduct(v));
        n.normalize();
        n.scale(-1);
        return n;
    }
    @Override
    public List<Point3D> FindIntersections(Ray ray) {
        List<Point3D> intersectionPoints = new ArrayList<Point3D>(1);
        // Intersecting the triangular plane
        Point3D po = ray.get_POO();
        Vector n = getNormal(null);
        Plane plane = new Plane(n,_p3);
        if (plane.FindIntersections(ray).isEmpty())
            return null;
        Point3D intersectionPlane = plane.FindIntersections(ray).get(0);
        // Checking if the interseculating point is bounded by the triangle
        Vector p_p0 = new Vector(po,intersectionPlane);
        // Checking 1/3 triangular side
        Vector v1_1 = new Vector(po,_p1);
        Vector v2_1 = new Vector(po,_p2);
        Vector N1 = v1_1.crossProduct(v2_1);
        N1.normalize();
        double s1 = -p_p0.dotProduct(N1);
        // Checking 2/3 triangular side
        Vector v1_2 = new Vector(po,_p2);
        Vector v2_2 = new Vector(po,_p3);
        Vector N2 = v1_2.crossProduct(v2_2);
        N2.normalize();
        double s2 = -p_p0.dotProduct(N2);
        // Checking 3/3 triangular side
        Vector v1_3 = new Vector(po,_p3);
        Vector v2_3 = new Vector(po,_p1);
        Vector N3 = v1_3.crossProduct(v2_3);
        N3.normalize();
        double s3 = -p_p0.dotProduct(N3);
        if ((s1 > 0 && s2 > 0 && s3 > 0)||(s1 < 0 && s2 < 0 && s3 < 0)){
            intersectionPoints.add(intersectionPlane);}
        return intersectionPoints;
    }
}
