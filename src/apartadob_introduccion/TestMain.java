package apartadob_introduccion;

public class TestMain {
    public static void main(String[] args){
        //BOOK
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

        //AUTHOR
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); //Test the constructor
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test

    }
}
