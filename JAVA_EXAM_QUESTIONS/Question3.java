// Prepare a program in Java to display student details

class University {
    String name;
    int age;
    int roll;
    String branch;
    void addName(String n) {
        name = n;
    }
    void addAge(int a) {
        age = a;
    }
    void addRoll(int r) {
        roll = r;
    }
    void addBranch(String b) {
        branch = b;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll);
        System.out.print("Branch: "+branch);
    }
}
public class Question3 {
    public static void main(String args[]) {
        University u = new University();
        u.addName("Debashis Halder");
        u.addAge(20);
        u.addRoll(93);
        u.addBranch("Computer Science");
        u.display();
    }
}