// Example of constructor hierarchy or sequence using multi level inheritance

class Animal {
    Animal() {
        System.out.println("animal constructor created");
    }
}
class Mammal extends Animal {
    Mammal() {
        System.out.println("mammal constructor created");
    }
}
class Human extends Mammal {
    Human() {
        System.out.println("human constructor created");
    }
}
public class Example8 {
    public static void main(String args[]) {
        Human h = new Human();
    }
}