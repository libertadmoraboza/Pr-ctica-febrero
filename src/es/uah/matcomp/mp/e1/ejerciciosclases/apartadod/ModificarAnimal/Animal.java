package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.ModificarAnimal;

abstract public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    abstract public void greeting();
}
