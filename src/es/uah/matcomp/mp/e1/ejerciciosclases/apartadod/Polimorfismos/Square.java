package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Polimorfismos;

public class Square extends Rectangle {

    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
