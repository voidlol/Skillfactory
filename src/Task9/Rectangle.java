package Task9;

public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return this.a * 2 + this.b * 2;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public double getHeight() {
        return Math.min(a, b);
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
