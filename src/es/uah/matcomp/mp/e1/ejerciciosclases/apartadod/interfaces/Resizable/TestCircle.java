package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.Resizable;

public class TestCircle {
    public static void main (String[] args){
        GeometricObject c1 = new Circle(2.4);
        System.out.println(c1);
        System.out.println("Area is: " + c1.getArea());
        System.out.println("Perimeter is: " + c1.getPerimeter());
    }
}
