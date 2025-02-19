package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.ModificarAnimal;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void greeting(){
        System.out.println("Meow!");
    }
}
