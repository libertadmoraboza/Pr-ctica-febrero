package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.interfaces.Movable;

public class TestMain {
    public static void main(String[] args){
        Movable p1 = new MovablePoint (2,3,5,6);
        System.out.println(p1);
        p1.moveUp();
        System.out.println("Point1 move up:" + p1);
        p1.moveDown();
        System.out.println("Point1 move down:" + p1);
        p1.moveLeft();
        System.out.println("Point1 move left:" + p1);
        p1.moveRight();
        System.out.println("Point1 move right:" + p1);

        MovablePoint p2 = (MovablePoint) p1;
        p2.moveUp();
        System.out.println("Point2 move up:" + p2);
        p2.moveDown();
        System.out.println("Point2 move down:" + p2);
        p2.moveLeft();
        System.out.println("Point2 move left:" + p2);
        p2.moveRight();
        System.out.println("Point2 move right:" + p2);

        Movable c1 = new MovableCircle(1,4,3,4,2);
        c1.moveUp();
        System.out.println("Circle1 move up:" + c1);
        c1.moveDown();
        System.out.println("Circle1 move down:" + c1);
        c1.moveLeft();
        System.out.println("Circle1 move left:" + c1);
        c1.moveRight();
        System.out.println("Circle1 move right:" + c1);

        MovableCircle c2 = (MovableCircle) c1;
        c2.moveUp();
        System.out.println("Circle2 move up:" + c2);
        c2.moveDown();
        System.out.println("Circle2 move down:" + c2);
        c2.moveLeft();
        System.out.println("Circle2 move left:" + c2);
        c2.moveRight();
        System.out.println("Circle2 move right:" + c2);




    }
}
