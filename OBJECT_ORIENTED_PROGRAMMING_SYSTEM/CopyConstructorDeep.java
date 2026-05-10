// Example of Copy Constructor (Concept of Deep Copy)

public class CopyConstructorDeep {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Debashis Halder";
        s1.roll = 28;
        s1.age = 18;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.age = 20;
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    String name;
    int roll;
    int age;
    int marks[];

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i]; // This is a Deep Copy
        }
    }

    Student() {
        marks = new int[3]; //This is a Non-Parameterized Constructor
    }

    Student(String name) {
        this.name = name;
        marks = new int[3]; //This is a Single Parameterized Constructor
    }

    Student(int roll, int age) {
        this.roll = roll;      
        this.age = age;
        marks = new int[3]; //This is a Double Parameterized Constructor
    }
}