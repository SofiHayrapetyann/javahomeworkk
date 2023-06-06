package Homework20;

public class Triangle {

    private Coordinates point1;
    private Coordinates point2;
    private Coordinates point3;

    public Triangle(Coordinates point1, Coordinates point2, Coordinates point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    @Override
    public String toString() {
        return "Triangle coordinates: [point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + "]";
    }
}
