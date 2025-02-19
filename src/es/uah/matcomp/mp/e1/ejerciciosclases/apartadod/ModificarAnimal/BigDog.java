package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.ModificarAnimal;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greeting(){
        System.out.println("Woow!");
    }
    @Override
    public void greeting(Dog another){
        System.out.println("Wooooooow!");
    }
}
