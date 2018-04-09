package Primitives;

public class Point3D extends Point2D {
    private Coordinate _z;

    // ***************** Constructors ********************** //
    public Point3D() {
        _x = new Coordinate();
        _y = new Coordinate();
        _z = new Coordinate();
    }

    ;

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        this._x = x;
        this._y = y;
        this._z = z;
    }

    ;

    public Point3D(double x, double y, double z) {
        _x.set_coordinate(x);
        _y.set_coordinate(y);
        _z = new Coordinate(z);
    }

    ;

    public Point3D(Point3D point3D) {
        _x = point3D._x;
        _y = point3D._y;
        _z = point3D._z;
    }

    ;

    // ***************** Getters/Setters ********************** //
    public Coordinate getZ() {
        return _z;
    }

    ;

    public void setZ(Coordinate _z) {
        this._z = _z;
    }

    ;

    // ***************** Administration ******************** //
    public int compareTo(Point3D point3D) {
        if (this._x.get_coordinate() == point3D._x.get_coordinate() &&
                this._y.get_coordinate() == point3D._y.get_coordinate() &&
                this._z.get_coordinate() == point3D._z.get_coordinate())
            return 0;
        return 1;
    }

    ;

    @Override // Implements print ()
    public String toString() {
        return String.format("(x = %.2f, y = %.2f, z =  %.2f)", _x.get_coordinate(), _y.get_coordinate(), _z.get_coordinate());
    }

    // ***************** Operations ******************** //

    // Add A Vector To A Point3D
    public void add(Vector vector){
        _x.add(vector.getHead()._x);
        _y.add(vector.getHead()._y);
        _z.add(vector.getHead().getZ());
    };

    // Subtract A Vector From Point3D
    public void subtract(Vector vector){
        _x.subtract(vector.getHead()._x);
        _y.subtract(vector.getHead()._y);
        _z.subtract(vector.getHead().getZ());
    };

    // Calculate The Distance Between 2 Point3D
    public double distance(Point3D point){

        _x.subtract(point._x);
        double m = Math.pow(_x.get_coordinate(),2);
        _y.subtract(point._y);
        double n = Math.pow(_y.get_coordinate(),2);
        _z.subtract(point.getZ());
        double l = Math.pow(_z.get_coordinate(),2);

        return Math.abs(Math.sqrt(m + n + l));
    };
}
