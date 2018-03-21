package Primitives;

public class Ray {

    // Point of origin
    private Point3D _POO;
    // Ray direction
    private Vector _direction;

    // ***************** Constructors ********************** //
    public Ray(){
        set_POO(new Point3D(0,0,0));
    }

    public Ray(Ray ray){
        this._POO = ray._POO;
        this._direction = ray._direction;
    }

    public Ray(Point3D poo, Vector direction) {
        _POO = poo;
        _direction = direction;
    }

    // ***************** Getters/Setters ********************** //

    public Point3D get_POO() {
        return _POO;
    }

    public void set_POO(Point3D _POO) {
        this._POO = _POO;
    }

    public Vector get_direction() {
        return _direction;
    }

    public void set_direction(Vector _direction) {
        this._direction = _direction;
    }
}
