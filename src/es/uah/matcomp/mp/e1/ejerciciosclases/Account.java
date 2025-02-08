package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public String getID() {

        return id;
    }
    public String getName() {

        return name;
    }
    public int getBalance() {

        return balance;
    }
    public int credit(int money){
        balance += money;
        return balance;
    }
    public int debit(int money) {
        if (money <= balance) {
            balance -= money;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo (Account account2, int money) {
        if (money <= balance) {
            balance -= money;
            account2.balance += money;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
