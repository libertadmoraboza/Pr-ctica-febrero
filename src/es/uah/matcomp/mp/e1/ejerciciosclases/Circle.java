package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {

        return radius;
    }
    public double getArea() {

        return radius * radius * Math.PI;
    }
    public String getColor() {

        return color;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public void setRadius(double radius) {

        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
