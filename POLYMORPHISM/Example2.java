// Example of Run Time Polymorphism (Dynamic) -> Function or Method Overriding

class Animal {
    void eat() {
        System.out.println("eat everything");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eat grass");
    }
}
public class Example2 {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();
    }
}
