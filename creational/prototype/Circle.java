public class Circle extends Shape {
    public int radius;

    public Circle() {
        super(0, 0, "black");
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(getX(), getY(), getColor(), radius);
    }

}
