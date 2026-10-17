package ru.mirea.baranov.pr2;

public class Ball {
    private double x, y, vx, vy;
    public Ball() { this(0, 0); }
    public Ball(double x, double y) { this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y) { this.x = x; this.y = y; }
    public void setSpeed(double vx, double vy) { this.vx = vx; this.vy = vy; }
    public void move() { move(vx, vy); }
    public void move(double dx, double dy) { x += dx; y += dy; }
    @Override public String toString() { return "Ball^(" + x + ", " + y + "^)"; }
}
