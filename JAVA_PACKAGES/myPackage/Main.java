package myPackage; // --> User Defined Package

import java.util.Scanner; // --> Inbuilt Package

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        Addition add = new Addition();
        System.out.print("The sum is: "+add.sum(a, b));
    }    
}
