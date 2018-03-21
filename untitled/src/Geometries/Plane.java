package Geometries;

import Primitives.Point3D;
import Primitives.Vector;
import Primitives.Ray;

import java.util.List;

public class Plane{

    private Vector _normal;
    private Point3D _Q;
    // ***************** Constructors ********************** //
    public Plane(){
         _normal = new Vector();
         _Q = new Point3D();
    };
    public Plane (Plane plane){
        _normal = plane._normal;
        _Q = plane._Q;
    };
    public Plane (Vector normal, Point3D q) {
        _normal = normal;
        _Q = q;
    };
    // ***************** Getters/Setters ********************** //
    public Vector getNormal(Point3D point){return _normal;};

    public Point3D getQ(){return _Q;};

    public void setNormal(Vector normal){this._normal = normal;};

    public void setQ(Point3D d){this._Q = d;};
    // ***************** Operations ******************** //
    //i have no idea what we need to do here.
    public List<Point3D> FindIntersections(Ray ray){
        return null;
    };
}
