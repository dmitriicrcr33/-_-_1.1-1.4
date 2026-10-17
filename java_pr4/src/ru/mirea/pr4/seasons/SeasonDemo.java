package ru.mirea.baranov.pr4.seasons;

public class SeasonDemo {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое: " + favorite + " ^(" + favorite.getAvgTemperature() + "^°C^)");
        switch (favorite) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
        for (Season s : Season.values()) System.out.printf("%s: %d°C — %s%n", s, s.getAvgTemperature(), s.getDescription());
    }
}
