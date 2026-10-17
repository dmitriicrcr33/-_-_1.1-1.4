package ru.mirea.baranov.pr3.shapes;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3.0, "blue", false), new Rectangle(2.0, 4.0, "green", true), new Square(5.0) };
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.printf("  S=%.2f, P=%.2f%n", s.getArea(), s.getPerimeter());
        }
        Square sq = (Square) shapes[2];
        sq.setWidth(7.0);
        System.out.println("После setWidth^(7^): " + sq.getSide());
    }
}
