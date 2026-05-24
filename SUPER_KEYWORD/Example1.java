/* This is an example of Constructor Sequence or Hierarchy
   In this case "super" keyword automatically called */

class Animal {
    Animal() {
        System.out.println("animal constructor created");
    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor created");
    }
}
public class Example1 {
    public static void main(String args[]) {
        Horse h = new Horse();
    }
}