// Example of "super" keyword

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor created");
    }
}
class Horse extends Animal {
    Horse() {
        super.color = "brown";
        System.out.println("horse constructor created");
    }
}
public class Example3 {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}   
   
