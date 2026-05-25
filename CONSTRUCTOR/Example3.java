// Example of Parameterized Constructor

class Student {
    int roll;
    float marks;
    Student(int roll, float marks) { // --> Parameterized Constructor (Double Parameter)
        this.roll = roll;
        this.marks = marks;
    }
}
public class Example3 {
    public static void main(String args[]) {
        Student s = new Student(93, 80);
        System.out.println("Roll No.: "+s.roll);
        System.out.println("Marks: "+s.marks);
    }
}
