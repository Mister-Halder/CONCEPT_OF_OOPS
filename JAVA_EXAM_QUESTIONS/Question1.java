/* Create a class Calculator with constructors:
   1. No parameter -> prints message
   2. One parameter -> prints square
   3. Two parameters -> prints sum
  Create objects to call all constructors */

// This is an example of constructor overloading  

class Calculator {
    Calculator() {
        System.out.println("Calculator Object Created");
    }
    Calculator(int a) {
        System.out.println("Square: "+(a*a));
    }
    Calculator(int a, int b) {
        System.out.print("Sum: "+(a+b));
    }
}
public class Question1 {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(5);
        Calculator c3 = new Calculator(10, 20);
    }
}
