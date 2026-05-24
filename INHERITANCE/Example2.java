// Example of Single Level Inheritance (It is a type of Basic Inheritance)

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
public class Example2 {
    public static void main(String args[]) {
        Mammal human = new Mammal();
        human.color = "brown";
        System.out.println(human.color);
        human.eat();
        human.breathe();
        human.walk();
    }
}