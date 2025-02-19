package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.Resizable;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    public String toString(){
        return "ResizableCircle[" + super.toString() + "]";
    }
    @Override
    public double resize (int percent){
        radius *= percent/100.0;
        return radius;
    }
}
