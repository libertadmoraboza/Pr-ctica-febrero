package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.RewritingAnimal;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }
}
