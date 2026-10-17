package ru.mirea.baranov.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(5, 7);
        System.out.println("Начало: " + b);
        b.move(3, -2);
        System.out.println("После move: " + b);
        b.setSpeed(1.5, 0.5);
        b.move();
        System.out.println("После move^(^) по скорости: " + b);
        System.out.println("Пустой мяч: " + new Ball());
    }
}
