public class Patrat extends Shape2D{
    private String color;
    private double side;

    public Patrat(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
