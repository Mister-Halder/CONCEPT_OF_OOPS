/* Create a class Calculator with constructors:
1. No parameter -> prints message
2. One parameter -> prints square
3. Two parameter -> prints sum
Create objects to call all constructors

Example of Constructor Overloading */
   
class Calculator {
    Calculator() { // --> Non-Parameterized Constructor (No Parameter)
        System.out.println("Calculator Object Created");
    }
    Calculator(int a) {
        System.out.println("Square: "+(a*a)); // --> Parameterized Constructor (Single Parameter)
    }
    Calculator(int a, int b) {
        System.out.println("Sum: "+(a+b)); // --> Parameterized Constructor (Double Parameters)
    }
}
public class Example5 {
    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(5);
        Calculator c3 = new Calculator(10, 20);
    }
}
