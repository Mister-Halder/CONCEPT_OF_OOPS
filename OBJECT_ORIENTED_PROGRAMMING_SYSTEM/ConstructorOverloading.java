// Constructor Overloading (Perfect Example of "Polymorphism") Concept

public class ConstructorOverloading {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Debashis");
        System.out.println(s2.name);
        Student s3 = new Student(12, 90);
        System.out.println(s3.roll);
        System.out.print(s3.marks);
    }
}
class Student {
    String name;
    int roll;
    float marks;

    Student() {
        System.out.println("Non-Parameterized Constructor is created....."); //This is a Non-Parameterized Constructor
    }

    Student(String name) {
        this.name = name; //This is a Single Parameterized Constructor
    }

    Student(int roll, float marks) {
        this.roll = roll;      
        this.marks = marks; //This is a Double Parameterized Constructor
    }
}
