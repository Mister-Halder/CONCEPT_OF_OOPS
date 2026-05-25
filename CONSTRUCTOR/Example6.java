/* Create a class Calculator with constructors:
1. No parameter -> prints message
2. One parameter -> prints square
3. Two parameter -> prints sum
Create objects to call all constructors
and implement switch case

Example of Constructor Overloading */

import java.util.Scanner;
class Calculator {
    Calculator() {
        System.out.println("Calculator Object Created");
    }
    Calculator(int a) {
        System.out.println("Square: "+(a*a));
    }
    Calculator(int a, int b) {
        System.out.println("Sum: "+(a+b));
    }
}
public class Example6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Only prints message");
        System.out.println("2. Prints square");
        System.out.println("3. Prints sum");
        System.out.print("Choose Option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                Calculator c1 = new Calculator();
                break;
            case 2:
                System.out.print("Enter number: ");
                int x = sc.nextInt();
                Calculator c2 = new Calculator(x);
                break;
            case 3:
                System.out.print("Enter first number: ");
                int y = sc.nextInt();
                System.out.print("Enter second number: ");
                int z = sc.nextInt();
                Calculator c3 = new Calculator(y, z);
                break;
            default:
                System.out.println("Invalid Choice");    

        }
        sc.close();
    }
}
