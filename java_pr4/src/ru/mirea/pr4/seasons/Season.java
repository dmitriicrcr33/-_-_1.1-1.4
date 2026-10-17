package ru.mirea.baranov.pr4.seasons;

public enum Season {
    WINTER(-8) { @Override public String getDescription() { return "Холодное время года"; } },
    SPRING(9)  { @Override public String getDescription() { return "Холодное время года"; } },
    SUMMER(24) { @Override public String getDescription() { return "Теплое время года"; } },
    AUTUMN(7)  { @Override public String getDescription() { return "Холодное время года"; } };
    private final int avgTemperature;
    Season(int avgTemperature) { this.avgTemperature = avgTemperature; }
    public int getAvgTemperature() { return avgTemperature; }
    public abstract String getDescription();
}
