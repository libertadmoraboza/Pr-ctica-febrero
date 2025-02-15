package e1.apartadoc;

import e1.apartadoc.Circle;

public class Cylinder extends Circle {
    private Circle base;
    private double height;
    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }
    public Cylinder (double height){
        base = new Circle();
        this.height = height;
    }
    public Cylinder(Circle base, double height){
        this.base = base;
        this.height = height;
    }
    public Circle getBase(){
        return base;
    }
    public void setBase(Circle base){
        this.base = base;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return base.getArea() * height;
    }
    public double getSurfaceArea(){
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }
    @Override
    public String toString(){
        return "Cylinder[base=" + base + ",height=" + height + "]";   }
}
