package e1.apartadoc;

import e1.apartadoc.Cylinder;

public class TestCylinder {
    public static void main (String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cilindro1: " + c1);
        System.out.println("Volumen: " + c1.getVolume());
        System.out.println("Área de la superficie: " + c1.getSurfaceArea());
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cilindro2: " + c2);
        System.out.println("Volumen: " + c2.getVolume());
        System.out.println("Área de la superficie: " + c2.getSurfaceArea());
        Circle base = new Circle (3.0, "blue");
        Cylinder c3 = new Cylinder(base, 10.0);
        System.out.println("Cylinder: " + c3);
        System.out.println("Volumen: " + c3.getVolume());
        System.out.println("Área de la superficie: " + c3.getSurfaceArea());
    }
}
