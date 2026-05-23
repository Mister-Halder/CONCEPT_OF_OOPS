/* Constructor with no parameter, one parameter & two parameters
   No parameter -> Only print message
   One parameter -> Print square
   Two parameter -> Print sum
   and all the things in this switch case */

// This is an example of constructor overloading   

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
public class Question10 {
    public static void main(String args[]) {
        System.out.println("1. Only print message");
        System.out.println("2. Print square");
        System.out.println("3. Print sum");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                Calculator c1 = new Calculator();
                break;
            case 2:
                Calculator c2 = new Calculator(5);
                break;
            case 3:
                Calculator c3 = new Calculator(10, 20);
                break;
            default:
                System.out.print("Invalid Choice");            
        }
        sc.close();
    }
}