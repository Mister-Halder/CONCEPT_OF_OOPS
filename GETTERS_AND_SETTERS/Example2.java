// Example of setter & getter function with using "this" keyword

class Student {
    String name;
    int age;
    int roll;
    private float marks;
    void setMarks(float marks) {
        this.marks = marks;
    }
    float getMarks() {
        return this.marks;
    }
}
public class Example2 {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Debashis Halder";
        s.age = 20;
        s.roll = 93;
        System.out.println("Student Name: "+s.name);
        System.out.println("Student Age: "+s.age);
        System.out.println("Student Roll: "+s.roll);
        s.setMarks(80);
        System.out.println("Student Marks: "+s.getMarks());
    }
}