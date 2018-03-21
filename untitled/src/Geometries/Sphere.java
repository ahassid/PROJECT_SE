package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;
import java.util.Map;

public class Sphere  extends RadialGeometry{
    private Point3D _center;
    // ***************** Constructors ********************** //
    public Sphere(){
        _center = new Point3D();
        _radius = 0;
    };
    public Sphere (Sphere sphere) {
        _center = sphere._center;
        _radius = 0;

    };
    public Sphere(double radius, Point3D center){
        _center = center;
        _radius = radius;
    };
    //what is this function?
    public Sphere(Map<String, String> attributes){};


    // ***************** Getters/Setters ********************** //
    public Point3D getCenter(){return _center;};

    public void setCenter(Point3D center){this._center = center;};
    // ***************** Operations ******************** //
    //i have no idea what we need to do here.
    public List<Point3D> FindIntersections(Ray ray){
        return null;
    };
    public Vector getNormal(Point3D point){
        return null;
    };
}
