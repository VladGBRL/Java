class Cerc extends Shape2D {
    private String color;
    private double radius;
    private final double PI = 3.14159;

    public Cerc(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }
}
