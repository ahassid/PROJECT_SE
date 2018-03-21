package Geometries;

public class Plane{
    private Vector _normal;
    private Point3D _Q;
    // ***************** Constructors ********************** //
    public Plane(){
         _normal = new vector();
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
    public List<Point3D> FindIntersections(Ray ray){
        return null;
    };
}
