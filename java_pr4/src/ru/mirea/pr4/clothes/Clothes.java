package ru.mirea.baranov.pr4.clothes;

public abstract class Clothes {
    private final Size size;
    private final double price;
    private final String color;
    public Clothes(Size size, double price, String color) { this.size = size; this.price = price; this.color = color; }
    public Size getSize() { return size; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    @Override public String toString() {
        return getClass().getSimpleName() + " [" + size + "/" + size.getEuroSize() + ", " + price + " руб., " + color + "]";
    }
}
