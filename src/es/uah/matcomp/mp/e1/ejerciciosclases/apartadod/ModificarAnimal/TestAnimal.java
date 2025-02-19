package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.ModificarAnimal;

public class TestAnimal {
    public static void main (String[] args){
        Cat cat1 = new Cat("Salem");
        cat1.greeting();
        Dog dog1 = new Dog("Audrey");
        dog1.greeting();
        BigDog bigDog1=new BigDog("Willow");
        bigDog1.greeting();

        Animal animal1 = new Cat("Leo");
        animal1.greeting();
        Animal animal2 = new Dog("Goofy");
        animal2.greeting();
        Animal animal3 = new BigDog("Lola");
        animal3.greeting();

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
