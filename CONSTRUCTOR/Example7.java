// Example of Copy Constructor

class Student {
    String name;
    int age;
    int roll;
    String branch;
    Student(String name, int age, int roll, String branch) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.branch = branch;
    }
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.roll = s.roll;
        this.branch = s.branch;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll);
        System.out.print("Branch: "+branch);
    }
}
public class Example7 {
    public static void main(String args[]) {
        Student s1 = new Student("Debashis Halder", 20, 93, "Computer Science");
        Student s2 = new Student(s1); // --> To make a copy of previous constructor
        s1.display();
        System.out.println();
        System.out.println();
        s2.display();
    }
}