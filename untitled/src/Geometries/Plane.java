package Geometries;

import Primitives.Point3D;
import Primitives.Vector;
import Primitives.Ray;

import java.util.List;

public class Plane{

    private Vector _normal;
    private Point3D _Q;
    // ***************** Constructors ********************** //
    // FUNCTION
//   Plane
// PARAMETERS
//   none
// RETURN VALUE
// none
// MEANING
// This functions builds a Plane (Equals The vector to 0)

    public Plane(){
         _normal = new Vector();
         _Q = new Point3D();
    };
    // FUNCTION
//   Plane
// PARAMETERS
//  Plane plane
// RETURN VALUE
// none
// MEANING
// This functions builds a Plane. It gets a Plane and and make it's value to the itself Plane.

    public Plane (Plane plane){
        _normal = plane._normal;
        _Q = plane._Q;
    };
    // FUNCTION
//   Plane
// PARAMETERS
//  Vector normal and Point3D q
// RETURN VALUE
// none
// MEANING
// This functions builds a Plane. It gets a normal and point 3D and copy they value to the itself Plane.

    public Plane (Vector normal, Point3D q) {
        _normal = normal;
        _Q = q;
    };
    // ***************** Getters/Setters ********************** //
    // FUNCTION
//   getNormal
// PARAMETERS
//   point 3D
// RETURN VALUE
// vector
// MEANING
// This functions returns the Normal of the plane
    public Vector getNormal(Point3D point){return _normal;};
    // ***************** Getters/Setters ********************** //
    // FUNCTION
//   getQ
// PARAMETERS
// none
// RETURN VALUE
// point 3D
// MEANING
// This functions returns the q of the plane
    public Point3D getQ(){return _Q;};
    // FUNCTION
//   setNormal
// PARAMETERS
//  Vector the normal
// RETURN VALUE
// none
// MEANING
// This functions sets the normal of the plane

    public void setNormal(Vector normal){this._normal = normal;};
    // FUNCTION
//   setQ
// PARAMETERS
//   point 3D the q
// RETURN VALUE
// none
// MEANING
// This functions sets the q of the plane

    public void setQ(Point3D d){this._Q = d;};
    // ***************** Operations ******************** //
    //i have no idea what we need to do here.
    // FUNCTION
//   FindIntersections
// PARAMETERS
//  Ray ray
// RETURN VALUE
// none
// MEANING
// This functions Find the Intersections of vector on view
    public List<Point3D> FindIntersections(Ray ray){
        return null;
    };
}
