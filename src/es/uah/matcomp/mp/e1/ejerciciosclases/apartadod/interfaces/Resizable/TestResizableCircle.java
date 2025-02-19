package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.Resizable;

public class TestResizableCircle {
    public static void main(String[] args){
        ResizableCircle c1 = new ResizableCircle(2);
        System.out.println(c1);
        c1.resize(10);
        System.out.println(c1);
    }
}
