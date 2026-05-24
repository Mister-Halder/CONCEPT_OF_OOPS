/* This is an example of Constructor Sequence or Hierarchy
   In this case "super" keyword used */

class Animal {
    Animal() {
        System.out.println("animal constructor created");
    }
}
class Horse extends Animal {
    Horse() {
        super(); // --> Use the "super" keyword
        System.out.println("horse constructor created");
    }
}
public class Example2 {
    public static void main(String args[]) {
        Horse h = new Horse();
    }
}   
   
