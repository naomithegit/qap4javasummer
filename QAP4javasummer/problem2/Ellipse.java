public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2.0);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
