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
        _P0 = new Point3D();
        _vUp = new Vector();
        _vTo = new Vector();
        _vRight = _vTo.crossProduct(_vUp);
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
        return null;
        // NEED TO DO!!!
    }
}
