class Sfera extends Shape3D {
    private String color;
    private double radius;
    private final double PI = 3.14159;

    public Sfera(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    double getArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3) * PI * radius * radius * radius;
    }
}
