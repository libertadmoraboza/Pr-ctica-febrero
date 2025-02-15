package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.CustomerYAccount.Customer;

public class Main {
    public static void main (String[] args){
        // CUSTOMER
        Customer c1 = new Customer(54, "Maria", 'f');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // ACCOUNT
        Account ac1 = new Account(23, c1, 283.3);
        System.out.println(ac1);
        ac1.setBalance(7834.2);
        System.out.println(ac1);
        System.out.println("id is: " + ac1.getId());
        System.out.println("customer is: " + ac1.getCustomer());
        System.out.printf("balance is: %.2f%n", ac1.getBalance());
        System.out.println("customer's name is: " + ac1.getCustomerName());
        ac1.deposit(150.56);
        System.out.printf("Después del depósito: %.2f%n", ac1.getBalance());
        ac1.withdraw(100.45);
        System.out.printf("Después del retiro: %.2f%n", ac1.getBalance());
        ac1.withdraw(7583459800.45);
    }
}
