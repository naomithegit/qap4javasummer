public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Ellipse(4, 2),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            shape.scale(factor);
        }
    }
}
