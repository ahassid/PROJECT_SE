package Primitives;

public class Coordinate implements Comparable<Coordinate> {
    private double _coordinate;

    // Those R The Constructors
    public Coordinate(){
        _coordinate = 0;
    }

    public Coordinate(double coordinate) {
        _coordinate = coordinate;
    }

    public Coordinate(Coordinate coordinate){
        this._coordinate = coordinate._coordinate;
    }

    // Get & Set Functions
    public double get_coordinate() {
        return _coordinate;
    }

    public void set_coordinate(double _coordinate) {
        this._coordinate = _coordinate;
    }

    // Implements CompareTo (Comparable Function)
    public int compareTo(Coordinate coordinate){
        if (this._coordinate == coordinate._coordinate)
            return 0;
        return 1;
    }

    // Add 2 Coordinates
    public void add (Coordinate coordinate){
        this._coordinate += coordinate._coordinate;
    }

    // Subtract 2 Coordinates
    public void subtract (Coordinate coordinate){
        this._coordinate -= coordinate._coordinate;
    }
}
