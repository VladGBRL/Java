import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SegmentDeDreapta segment = new SegmentDeDreapta("rosu", 5.0);
        System.out.println("Lungimea segmentului de dreapta: " + segment.getPerimeter());

        List<Shape2D> shapes2D = new ArrayList<>();
        shapes2D.add(new Patrat("albastru", 4.0));
        shapes2D.add(new Cerc("verde", 3.0));

        double totalPerimeter2D = 0;
        for (Shape2D shape : shapes2D) {
            totalPerimeter2D += shape.getPerimeter();
        }
        System.out.println("Perimetrul total pentru pătrate și cercuri: " + totalPerimeter2D);

        double totalArea2D = 0;
        for (Shape2D shape : shapes2D) {
            totalArea2D += shape.getArea();
        }
        System.out.println("Aria totală pentru pătrate și cercuri: " + totalArea2D);

        List<Shape3D> shapes3D = new ArrayList<>();
        shapes3D.add(new Sfera("roz", 2.0));
        shapes3D.add(new Cub("galben", 3.0));

        double totalVolume3D = 0;
        for (Shape3D shape : shapes3D) {
            totalVolume3D += shape.getVolume();
        }
        System.out.println("Volumul total pentru sfere și cuburi: " + totalVolume3D);
    }
}
