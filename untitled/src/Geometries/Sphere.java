package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;
import java.util.Map;

public class Sphere  extends RadialGeometry{
    private Point3D _center;
    // ***************** Constructors ********************** //
    // FUNCTION
//   Sphere
// PARAMETERS
//   none
// RETURN VALUE
// none
// MEANING
// This functions builds a Sphere (Equals The vector of the center ant the radius to 0)

    public Sphere(){
        _center = new Point3D();
        _radius = 0;
    };
    // FUNCTION
//   Sphere
// PARAMETERS
//  Sphere
// RETURN VALUE
// none
// MEANING
// This functions builds a Sphere. It gets a Sphere and and make it's value to the itself Sphere.

    public Sphere (Sphere sphere) {
        _center = sphere._center;
        _radius = 0;

    };
    // FUNCTION
//   Sphere
// PARAMETERS
//  double radius and Point3D center
// RETURN VALUE
// none
// MEANING
// This functions builds a Sphere. It gets a radius and Point3D center and make it's value to the itself Sphere.
    public Sphere(double radius, Point3D center){
        _center = center;
        _radius = radius;
    };
    //what is this function?
    public Sphere(Map<String, String> attributes){};


    // ***************** Getters/Setters ********************** //
    // FUNCTION
//   getCenter
// PARAMETERS
//   none
// RETURN VALUE
// _center
// MEANING
// This functions returns the center of the Cylinder
    public Point3D getCenter(){return _center;};
    // FUNCTION
//   setCenter
// PARAMETERS
//  Point3D Center
// RETURN VALUE
// none
// MEANING
// This functions sets the Center of the Cylinder
    public void setCenter(Point3D center){this._center = center;};
    // ***************** Operations ******************** //
    //i have no idea what we need to do here.
    public List<Point3D> FindIntersections(Ray ray){
        return null;
    };
    // FUNCTION
//   getNormal
// PARAMETERS
//  Point3D point
// RETURN VALUE
// none
// MEANING
// This functions get the Normal from 2 vectors
    public Vector getNormal(Point3D point){
        return null;
    };
}
