package Primitives;

public class Point2D implements Comparable<Point2D> {
    protected Coordinate _x;
    protected Coordinate _y;

    // Those R The Constructors
    public Point2D(){
        _x = new Coordinate();
        _y = new Coordinate();
    }

    public Point2D(Coordinate x, Coordinate y){
        this._x = x;
        this._y = y;
    }

    public Point2D(Point2D point2D){
        _x = point2D._x;
        _y = point2D._y;
    }

    // Get & Set Functions
    public Coordinate getX(){
        return _x;
    }
    public Coordinate getY(){
        return _y;
    }

    public void setX(Coordinate _x){
        this._x = _x;
    }

    public void setY(Coordinate _y){
        this._y = _y;
    }

    @Override // Implements CompareTo (Comparable Function)
    public int compareTo(Point2D point2D) {
        if (this._x == point2D._x && this._y == point2D._y)
            return 0;
        return 1;
    }
}
