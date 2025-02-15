package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.CustomerYAccount.Customer;

public class Account extends Customer {
    private int id;
    private Customer customer;
    private double balance;
    public Account(int id, Customer customer, double balance){
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer){
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        return customer.toString() + " balance=$" + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}
