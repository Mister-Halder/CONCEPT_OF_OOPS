/* Constructor Calling Hierarchy or Sequence from Abstract Base Class (Parent Class) 
   to following Derived Classes (Child Classes) */

abstract class Animal {
    Animal() {
        System.out.println("annimal constructor called");
    }
    abstract void walk();
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class Example3 {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
    }
}
