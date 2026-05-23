// Write a Java program using switch case to perform basic calculator operations (+, –, ×, ÷)

import java.util.Scanner;
public class Question12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("1. Perform Addition");
        System.out.println("2. Perform Substraction");
        System.out.println("3. Perform Multiplication");
        System.out.println("4. Perform Division");
        System.out.print("Choose Option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Result: "+(a+b));
                break;
            case 2:
                System.out.println("Result: "+(a-b));
                break;
            case 3:
                System.out.println("Result: "+(a*b));
                break;
            case 4:
                if(b!=0) {
                    System.out.println("Result: "+(a/b));
                }
                else {
                    System.out.println("Division by zero is not possible");
                }
                break;
            default:
                System.out.print("Invalid Choice");    
        }
        sc.close();
    }
}