// Prepare a program in Java to display student details using constructor initialization

class University {
    String name;
    int age;
    int roll;
    String branch;
    University(String n, int a, int r, String b) {
        name = n;
        age = a;
        roll = r;
        branch = b;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll);
        System.out.print("Branch: "+branch);
    }
}
public class Question4 {
    public static void main(String args[]) {
        University u = new University("Debashis Halder", 20, 93, "Computer Science");
        u.display();
    }
}
