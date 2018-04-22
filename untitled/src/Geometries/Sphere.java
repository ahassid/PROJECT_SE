package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.ArrayList;
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
    // Checking if the interseculating point is bounded by the triangle
    @Override
    public List<Point3D> FindIntersections(Ray ray){
        List<Point3D> intersectionPoints= new ArrayList<Point3D>();
        Vector l = new Vector(ray.get_POO());
        double tm = l.dotProduct(ray.get_direction());
        double d = Math.sqrt(Math.pow(l.length(),2) - Math.pow(tm,2));
        if (d > this.getRadius())
            return intersectionPoints;
        double th = Math.sqrt(Math.pow(this.getRadius(),2) - Math.pow(d,2));
        double t1 = tm - th;
        double t2 = tm + th;
        if (t1>=0){
            Vector v = ray.get_direction();
            v.scale(t1);
            Point3D p1 = ray.get_POO();
            p1.add(v);
            intersectionPoints.add(p1);
        }
        if (t2>=0){
            Vector v = ray.get_direction();
            v.scale(t2);
            Point3D p2 = ray.get_POO();
            p2.add(v);
            intersectionPoints.add(p2);
        }
        return intersectionPoints;
    };
    // FUNCTION
//   getNormal
// PARAMETERS
//  Point3D point
// RETURN VALUE
// none
// MEANING
// This functions get the Normal from 2 vectors
    @Override
    public Vector getNormal(Point3D point){
      Vector n = new Vector(_center,point);
      n.normalize();
      return n;
    };
}