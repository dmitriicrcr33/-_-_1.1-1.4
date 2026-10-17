package ru.mirea.baranov.pr3.movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable[] items = { new MovablePoint(0, 0, 2, 3), new MovableCircle(5, 5, 1, 2, 4), new MovableRectangle(0, 0, 8, 4, 2, 2) };
        for (Movable m : items) {
            System.out.println("До:    " + m);
            m.moveUp(); m.moveRight();
            System.out.println("После: " + m);
        }
        try { new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(1, 1, 2, 2)); }
        catch (IllegalArgumentException e) { System.out.println("Ожидаемая ошибка: " + e.getMessage()); }
    }
}
