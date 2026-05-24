// Example of Hybrid Inheritance

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
public class Example5 {
    public static void main(String args[]) {
        Fish shark = new Fish();
        Fish tuna = new Fish();
        Bird sparrow = new Bird();
        Bird peacock = new Bird();
        Mammal human = new Mammal();
        Mammal dog = new Mammal();
        Mammal cat = new Mammal();
        shark.color = "black & white";
        System.out.println(shark.color);
        shark.eat();
        shark.breathe();
        shark.fins = 2;
        System.out.println(shark.fins);
        shark.swim();
        System.out.println();
        System.out.println();
        tuna.color = "silver";
        System.out.println(tuna.color);
        tuna.eat();
        tuna.breathe();
        tuna.fins = 2;
        System.out.println(tuna.fins);
        tuna.swim();
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
        peacock.color = "royal blue";
        System.out.println(peacock.color);
        peacock.eat();
        peacock.breathe();
        peacock.wings = 2;
        System.out.println(peacock.wings);
        peacock.fly();
        System.out.println();
        System.out.println();
        human.color = "brown";
        System.out.println(human.color);
        human.eat();
        human.breathe();
        human.legs = 2;
        System.out.println(human.legs);
        human.walk();
        System.out.println();
        System.out.println();
        dog.color = "black";
        System.out.println(dog.color);
        dog.eat();
        dog.breathe();
        dog.legs = 2;
        System.out.println(dog.legs);
        dog.walk();
        System.out.println();
        System.out.println();
        cat.color = "white";
        System.out.println(cat.color);
        cat.eat();
        cat.breathe();
        cat.legs = 2;
        System.out.println(cat.legs);
        cat.walk();
    }
}
