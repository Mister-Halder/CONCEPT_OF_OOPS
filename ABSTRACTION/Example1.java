// Example of abstract class

abstract class Animal {
    void eat() {
        System.out.print("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    void walk() {
        System.out.print("walks on 4 legs");
    }
}
class Chicken extends Animal {
    void walk() {
        System.out.print("walks on 2 legs");
    }
}
public class Example1 {
    public static void main(String args[]) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.eat();
        System.out.println();
        h.walk();
        System.out.println();
        System.out.println();
        c.eat();
        System.out.println();
        c.walk();
    }
}