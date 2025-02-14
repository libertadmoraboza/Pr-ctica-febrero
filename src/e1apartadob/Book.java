package e1apartadob;

import java.util.Arrays;
public class Book extends Author {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book (String name, Author[] authors, double price){
        super(authors[0].getName(), authors[0].getEmail(), authors[0].getGender());
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty){
        super(authors[0].getName(), authors[0].getEmail(), authors[0].getGender());
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[name=" + name +",authors=" + Arrays.toString(getAuthors()) + ",price=" + price + ",qty=" + qty +"]";
    }
    public String getAuthorNames(){
        return authors[0].getName();
    }
    public String getEmailName(){
        return authors[0].getEmail();
    }
}
