// Example of Constructor Overloading

class Student {
    String name;
    int roll;
    float marks;
    Student() { // --> Non-Parameterized Constructor (No Parameter)
        System.out.println("Student Object Created");
    }
    Student(String name) { // --> Parameterized Constructor (Single Parameter)
        this.name = name;
    }
    Student(int roll, float marks) { // --> Parameterized Constructor (Double Parameters)
        this.roll = roll;
        this.marks = marks;
    }
}
public class Example4 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Debashis Halder");
        Student s3 = new Student(93, 80);
        System.out.println(s2.name);
        System.out.println(s3.roll);
        System.out.println(s3.marks);
    }   
}
