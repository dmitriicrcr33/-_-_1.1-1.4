package ru.mirea.baranov.pr3.shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() { this(1.0, 1.0); }
    public Rectangle(double width, double length) { this(width, length, "red", true); }
    public Rectangle(double width, double length, String color, boolean filled) { super(color, filled); this.width = width; this.length = length; }
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
    @Override public double getArea() { return width * length; }
    @Override public double getPerimeter() { return 2 * (width + length); }
    @Override public String toString() { return "Rectangle^(w=" + width + ", l=" + length + ", " + super.toString() + "^)"; }
}
