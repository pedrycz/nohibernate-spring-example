package cz.pedry.examplespringapp.model;

public class Rectangle implements Geometry {

    private double minX;
    private double minY;
    private double maxX;
    private double maxY;

    public Rectangle() {
    }

    public Rectangle(double minX, double minY, double maxX, double maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public double getMinX() {
        return minX;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public double getMinY() {
        return minY;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public double getMaxX() {
        return maxX;
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    public double getMaxY() {
        return maxY;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return "Rectangle{minX=" + minX + ", minY=" + minY + ", maxX=" + maxX + ", maxY=" + maxY + "}";
    }

    public double area() {
        return (maxY - minY) * (maxX - minX);
    }

}
