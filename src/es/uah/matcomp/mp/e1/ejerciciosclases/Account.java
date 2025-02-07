package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private final String id;
    private final String name;
    private int balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalanece(){
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount){
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance){
            balance = balance - amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return balance;
    }

    public String toString(){
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
