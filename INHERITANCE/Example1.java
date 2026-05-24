// Example of Basic Inheritance

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims");
    }
}
public class Example1 {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.color = "black & white";
        System.out.println(shark.color);
        shark.eat();
        shark.breathe();
        shark.fins = 2;
        System.out.println(shark.fins);
        shark.swim();
    }
}
