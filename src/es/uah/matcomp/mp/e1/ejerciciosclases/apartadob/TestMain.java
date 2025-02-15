package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob;

public class TestMain {
    public static void main(String[] args){
        // AUTHOR
        Author a1 = new Author ("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // BOOK
        Book b1 = new Book ("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());

        // CUSTOMER
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // INVOICE
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());
        System.out.printf("amount is: %.2f%n", inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
        // MyPoint

        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3,0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0,4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance());

        // CREA ARRAY
        MyPoint[] p= new MyPoint[10];
        for (int i = 0; i < 10; i++){
            p[i] = new MyPoint(i+1,i+1);
        }
        System.out.println("Matriz de distancias: ");
        for (int i = 0; i< p.length; i++){
            for (int j = 0; j < p.length; j++){
                System.out.printf("%.2f\t", p[i].distance(p[j]));
            } System.out.println();
        }
        // MyPoint y MyLine

        MyPoint punto1 = new MyPoint(2,3);
        MyPoint punto2 = new MyPoint(5,7);
        MyLine l1 = new MyLine(punto1,punto2);
        System.out.println("Primera línea: " + l1);
        MyLine l2 = new MyLine(1,1,4,5);
        System.out.println("Segunda línea:" + l2);
        System.out.printf("Longitud de línea 1: %.2f%n", l1.getLength());
        System.out.printf("Pendiente de la línea 1: %.2f%n", l1.getGradient());
        l1.setBeginX(2);
        l1.setBeginY(3);
        l1.setEndX(2);
        l1.setEndY(9);
        System.out.println("Línea 1:" + l1);
        System.out.printf("Longitud: %.2f%n", l1.getLength());
        int[] b = l1.getBeginXY();
        int[] e = l1.getEndXY();
        System.out.println("Coordenadas iniciales: (" + b[0] + "," + b[1] + ")");
        System.out.println("Coordenadas finales: (" + e[0] + "," + e[1] + ")");

        // MyCircle
        MyCircle cir1 = new MyCircle();
        System.out.println("Círculo 1: " + cir1);
        MyCircle cir2 = new MyCircle(3,4,5);
        System.out.println("Círculo 2: " + cir2);
        MyPoint center = new MyPoint(3,8);
        MyCircle cir3 = new MyCircle(center, 10);
        System.out.println("Círculo 3: " + cir3);
        System.out.printf("Área de círculo 2: %.2f%n", cir2.getArea());
        System.out.printf("Circunferencia de círculo 2: %.2f%n", cir2.getCircumference());
        cir1.setCenterXY(2,2);
        cir1.setRadius(7);
        System.out.println(cir1);
        System.out.println(cir1.getCenter());
        System.out.println(cir1.getRadius());

        // MyTriangle
        MyTriangle t1 = new MyTriangle(0,0,4,0,2,3);
        System.out.println(t1);
        System.out.printf("Perímetro: %.2f%n", t1.getPerimeter());
        System.out.println("Tipo: " + t1.getType());
        MyPoint punt1 = new MyPoint(1,1);
        MyPoint punt2 = new MyPoint(3,1);
        MyPoint punt3 = new MyPoint(2,4);
        MyTriangle t2 = new MyTriangle(punt1, punt2, punt3);
        System.out.println(t2);
        System.out.printf("Perímetro: %.2f%n", t2.getPerimeter());
        System.out.println("Tipo: " + t2.getType());



    }
}
