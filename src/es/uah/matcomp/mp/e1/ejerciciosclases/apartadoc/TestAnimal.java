package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc;

public class TestAnimal {
    public static void main(String[] args){
        Animal a = new Animal("Pepe");
        System.out.println(a);
        Mammal b = new Mammal("Carlos");
        System.out.println(b);
        Cat c = new Cat("Don Gato");
        System.out.println(c);
        c.greets();
        Dog d1 = new Dog("Audrey");
        System.out.println(d1);
        d1.greets();
        Dog d2 = new Dog("Goofy");
        d2.greets(d1);


    }
}
