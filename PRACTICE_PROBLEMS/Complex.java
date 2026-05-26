import java.util.Scanner;
public class Complex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("i is an imaginary number");
        System.out.print("Enter real part of first complex number: ");
        int a = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int b = sc.nextInt();
        System.out.print("Enter real part of second complex number: ");
        int c = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int d = sc.nextInt();
        System.out.println("1. Perform Addition");
        System.out.println("2. Perform Substraction");
        System.out.println("3. Perform Multiplication");
        System.out.print("Choose Option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("The result is: "+(a+c)+"+"+(b+d)+"i");
                break;
            case 2:
                System.out.println("The result is: "+(a-c)+"+"+(b-d)+"i");
                break;
            case 3:
                System.out.println("The result is: "+((a*c)-(b*d))+"+"+((a*d)+(b*c))+"i");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}