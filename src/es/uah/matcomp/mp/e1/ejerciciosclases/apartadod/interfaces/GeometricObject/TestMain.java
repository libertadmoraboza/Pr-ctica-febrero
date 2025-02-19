package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.GeometricObject;

import es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.GeometricObject.GeometricObject;
import es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.GeometricObject.Rectangle;

public class TestMain {
    public static void main(String[] args){
        GeometricObject c1 = new Circle(2.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = (Circle)c1;
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        GeometricObject r1 = new Rectangle(2.5, 5.5);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = (Rectangle)r1;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

    }
}
