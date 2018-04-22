package Geometries;

import Primitives.Point3D;
import Primitives.Vector;
import Primitives.Ray;

import java.util.ArrayList;
import java.util.List;

public class Plane extends RadialGeometry{

    private Vector _normal = null;
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
// This functions builds a Plane. It gets a Plane and and make its value to the itself Plane.
    public Plane (Plane plane){
        _normal = plane.getNormal(null);
        _Q = plane.getQ();
    };

    // FUNCTION
//   Plane
// PARAMETERS
//  Vector normal and Point3D q
// RETURN VALUE
// none
// MEANING
// This functions builds a Plane. It gets a normal and point 3D and copy their values to the itself Plane.
    public Plane (Vector normal, Point3D q) {
        _normal = new Vector(normal);
        _normal.normalize();
        _Q = new Point3D(q);
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
    public Vector getNormal(Point3D point){return new Vector(_normal);}

    // FUNCTION
//   getQ
// PARAMETERS
// none
// RETURN VALUE
// point 3D
// MEANING
// This functions returns the q of the plane
    public Point3D getQ(){return new Point3D(_Q);}

    // FUNCTION
//   setNormal
// PARAMETERS
//  Vector the normal
// RETURN VALUE
// none
// MEANING
// This functions sets the normal of the plane
    public void setNormal(Vector normal){this._normal = new Vector(normal);}

    // FUNCTION
//   setQ
// PARAMETERS
//   point 3D the q
// RETURN VALUE
// none
// MEANING
// This functions sets the q of the plane
    public void setQ(Point3D d){this._Q = new Point3D(d);}

    // ***************** Operations ******************** //

    // FUNCTION
//   FindIntersections
// PARAMETERS
//  Ray ray
// RETURN VALUE
// none
// MEANING
// This functions Find the Intersections of vector on view
    public List<Point3D> FindIntersections(Ray ray){

        List<Point3D> intersectionPointsPlane = new ArrayList<Point3D>();
        Point3D P0 = ray.get_POO();
        Point3D Q0 = this.getQ();
        Vector N = this.getNormal(null);
        Vector V = ray.get_direction();
        Vector v = new Vector(P0, Q0);
        double t = -1 * N.dotProduct(v) / N.dotProduct(v);

        if (t >= 0) {
            V.scale(t);
            P0.add(V);
            intersectionPointsPlane.add(P0);
        }
            return intersectionPointsPlane;
    };
}
