// Example of Hierarchial Inheritance

class Animals {
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
class Bird extends Animal {
    int wings;
    void fly() {
        System.out.println("flies");
    }
}
class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}
public class Example4 {
    public static void main(String args[]) {
        Fish shark = new Fish();
        Bird sparrow = new Bird();
        Mammal human = new Mammal();
        shark.color = "black & white";
        System.out.println(shark.color);
        shark.eat();
        shark.breathe();
        shark.fins = 2;
        System.out.println(shark.fins);
        shark.swim();
        System.out.println();
        System.out.println();
        sparrow.color = "dark brown";
        System.out.println(sparrow.color);
        sparrow.eat();
        sparrow.breathe();
        sparrow.wings = 2;
        System.out.println(sparrow.wings);
        sparrow.fly();
        System.out.println();
        System.out.println();
        human.color = "brown";
        System.out.println(human.color);
        human.eat();
        human.breathe();
        human.legs = 2;
        System.out.println(human.legs);
        human.walk();
    }
}
