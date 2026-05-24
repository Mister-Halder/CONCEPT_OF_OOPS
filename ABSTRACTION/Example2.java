// Example of abstract class and it can have constructors

abstract class Animal {
    String color;
    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.print("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
        System.out.println(color);
    }
    void walk() {
        System.out.print("walks on 4 legs");
    }
}
class Chicken extends Animal {
    void changeColor() {
        color = "lite yellow";
        System.out.println(color);
    }
    void walk() {
        System.out.print("walks on 2 legs");
    }
}
public class Example2 {
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
        System.out.println();
        System.out.println();
        System.out.println(h.color);
        h.changeColor();
        System.out.println();
        System.out.println(c.color);
        c.changeColor();
    }
}