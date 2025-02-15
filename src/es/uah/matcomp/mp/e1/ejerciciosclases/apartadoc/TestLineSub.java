package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc;

public class TestLineSub {
    public static void main(String[] args){
        Point p1 = new Point(1.5f, 2.2f);
        Point p2 = new Point (4.3f, 6.7f);
        LineSub l1 = new LineSub(0.0f, 0.0f, 3.0f, 4.0f);
        System.out.println(l1);
        System.out.printf("Longitud: %.2f%n", l1.getLength());
        System.out.printf("Pendiente: %.2f%n", l1.getGradient());
        LineSub l2 = new LineSub(p1,p2);
        System.out.println(l2);
        System.out.printf("Longitud: %.2f%n", l2.getLength());
        System.out.printf("Pendiente: %.2f%n", l2.getGradient());
        l2.setEndXY(7.1f, 10.3f);
        System.out.println(l2);
        System.out.printf("Longitud: %.2f%n", l2.getLength());
        System.out.printf("Pendiente: %.2f%n", l2.getGradient());


    }
}
