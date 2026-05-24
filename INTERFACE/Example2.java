// Multiple Inheritance using interfaces in java

interface Herbivore {
    void eatGrass();
}
interface Carnivore {
    void eatMeat();
}
class Bear implements Herbivore, Carnivore {
    public void eatGrass() {
        System.out.println("eats grass");
    }
    public void eatMeat() {
        System.out.println("eats meat");
    }
    void walk() {
        System.out.println("walks on 2 or 4 legs");
    }
}
public class Example2 {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
        b.walk();
    }
}