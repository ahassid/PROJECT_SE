package Primitives;

// import static com.sun.tools.corba.se.idl.constExpr.Expression.zero;

public class Vector implements Comparable<Vector> {

    private Point3D _head;


    // ***************** Constructors ********************** //

    public Vector() {
        _head = new Point3D(0, 0, 0);
    }

    public Vector(Point3D head) {
        _head = new Point3D(head);
    }

    public Vector(Vector vector) {
        _head = new Point3D(vector._head);
    }

    public Vector(double xHead, double yHead, double zHead) {
        _head = new Point3D(new Coordinate(xHead), new Coordinate(yHead), new Coordinate(zHead));
    }

    public Vector(Point3D p1, Point3D p2) {
        p1.subtract(new Vector(p2));
        _head = new Point3D(p1._x, p1._y, p1.getZ());
    }


    // ***************** Getters/Setters ********************** //

    public Point3D getHead() {
        return _head;
    }

    public void setHead(Point3D head) {
        _head = head;
    }


    // ***************** Administration ******************** //

    @Override
    // Implements CompareTo (Comparable Function)
    public int compareTo(Vector vector) {

        if (_head.compareTo(vector._head) == 0)
            return 0;
        return 1;

    }

    public String toString() {

        return String.format("the coordinates are: x = %.2f, y = %.2f, z =  %.2f",
                _head._x.get_coordinate(), _head._y.get_coordinate(), _head.getZ().get_coordinate());

    }


    // ***************** Operations ******************** //

    // Add 2 Vectors
    public void add(Vector vector) {
        _head.add(vector);
    }

    // Subtract 2 Vectors
    public void subtract(Vector vector) {
        _head.subtract(vector);
    }

    // Do Scalar Multiplication
    public void scale(double scalingFactor) {
        _head = new Point3D(_head._x.get_coordinate() * scalingFactor,
                _head._y.get_coordinate() * scalingFactor, _head.getZ().get_coordinate() * scalingFactor);
    }

    // Return Cross Product Calculation
    public Vector crossProduct(Vector vector) {

        double x1 = _head._x.get_coordinate(); // First Vector X Coordinate
        double y1 = _head._y.get_coordinate(); // First Vector Y Coordinate
        double z1 = _head.getZ().get_coordinate(); // First Vector Z Coordinate
        double x2 = vector._head._x.get_coordinate(); // Second Vector X Coordinate
        double y2 = vector._head._y.get_coordinate(); // Second Vector Y Coordinate
        double z2 = vector._head.getZ().get_coordinate(); // Second Vector Z Coordinate

        Vector v = new Vector(y1 * z2 - y2 * z1, z1 * x2 - x1 * z2, x1 * y2 - x2 * y1);
        return v;
    }

    // Return The Vector's Length
    public double length() {
        double x = _head._x.get_coordinate(); // X Coordinate
        double y = _head._y.get_coordinate(); // Y Coordinate
        double z = _head.getZ().get_coordinate(); // Z Coordinate
        return Math.sqrt(Math.abs(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }


    public void normalize() { // Throws exception if length = 0
        if (this.length() == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");

        // Otherwise
        double l = this.length();
        this.scale(1/l);
    }

    // Return dotProduct Calculation
    public double dotProduct(Vector vector) {

        double x1 = _head._x.get_coordinate(); // First Vector X Coordinate
        double y1 = _head._y.get_coordinate(); // First Vector Y Coordinate
        double z1 = _head.getZ().get_coordinate(); // First Vector Z Coordinate
        double x2 = vector._head._x.get_coordinate(); // Second Vector X Coordinate
        double y2 = vector._head._y.get_coordinate(); // Second Vector X Coordinate
        double z2 = vector._head.getZ().get_coordinate(); // Second Vector Z Coordinate

        return x1 * x2 + y1 * y2 + z1 * z2;
    }
}
