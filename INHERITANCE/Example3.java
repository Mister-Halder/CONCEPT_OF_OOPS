// Example of Multi Level Inheritance

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
    void understand() {
        System.out.println("understands");
    }
}
class Human extends Mammal {
    void talk() {
        System.out.println("talks");
    }
    void intelligent() {
        System.out.println("very intelligent");
    }
}
public class Example3 {
    public static void main(String args[]) {
        Human men = new Human();
        men.color = "brown";
        System.out.println(men.color);
        men.eat();
        men.breathe();
        men.walk();
        men.understand();
        men.talk();
        men.intelligent();
    }
}
