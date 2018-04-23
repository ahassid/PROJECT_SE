package Elements;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

public class Camera {

    //Eye point of the camera
    private Point3D _P0;
    private Vector _vUp;
    private Vector _vTo;

    //Should be calculated as the cross product if vUp and vTo
    private Vector _vRight;

//   ***************** Constructors  ********************** //

    public Camera() {
        _P0 = new Point3D(0, 0, 10);
        _vUp = new Vector(1.0, 0.0, 0.0);
        _vTo = new Vector(0.0, 0.0, -1.0);

        _vRight = _vUp.crossProduct(_vTo);
    }

    public Camera(Camera camera) {

        _P0 = camera.get_P0();
        _vUp = camera.get_vUp();
        _vTo = camera.get_vTo();
        _vRight = camera.get_vRight();
    }

    public Camera(Point3D P0, Vector vUp, Vector vTo) {
        _P0 = new Point3D(P0);
        _vUp = new Vector(vUp);
        _vTo = new Vector(vTo);

        _vRight = _vUp.crossProduct(_vTo);
        _vUp = _vTo.crossProduct(_vRight);
        _vUp.normalize();
        _vTo.normalize();
        _vRight.normalize();
    }

    //  ***************** Getters/Setters  ********************** //

    public Point3D get_P0() {
        return new Point3D(_P0);
    }

    public void set_P0(Point3D _P0) {
        this._P0 = new Point3D(_P0);
    }

    public Vector get_vUp() {
        return new Vector(_vUp);
    }

    public void set_vUp(Vector _vUp) {
        this._vUp = new Vector(_vUp);
    }

    public Vector get_vTo() {
        return new Vector(_vTo);
    }

    public void set_vTo(Vector _vTo) {
        this._vTo = new Vector(_vTo);
    }

    public Vector get_vRight() {
        return new Vector(_vRight);
    }

//  ***************** Administration  **********************

    public String toString() {
        return "Vto: " + _vTo + "\n" + "Vup: " + _vUp + "\n" + "Vright:" + _vRight + ".";
    }

    //  ***************** Operations  ******************** //

    public Ray constructRayThroughPixel(int Nx, int Ny, double x, double y, double screenDist, double screenWidth, double screenHeight) {

        // Calculate The Center Of The Image
        Point3D Pc = new Point3D(_P0);
        Vector vToward = new Vector(_vTo);
        vToward.scale(screenDist);
        Pc.add(vToward); // (we added the vector to the camera's center and got the image's center)

        // Calculate x-y Ratios (pixel width)
        double Ry = screenHeight / Ny;
        double Rx = screenWidth / Nx;

        // Calculate The Intersection Point (P)
        Vector vRight = new Vector(_vRight);
        Vector vUp = new Vector(_vUp);
        vUp.scale(((y - (Ny / 2.0)) * Ry + 0.5 * Ry));
        vRight.scale(((x - (Nx / 2.0)) * Rx + 0.5 * Rx));
        vRight.subtract(vUp);
        Pc.add(vRight);
        Point3D P = new Point3D(Pc);

        // Construct Ray Between The Intersection & P0
        Vector ray = new Vector(_P0, P);
        ray.normalize();

        return new Ray(P, ray);

    }
}