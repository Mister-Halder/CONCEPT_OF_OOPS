// Example of Encapsulation

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
public class Example3 {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Debashis Halder";
        System.out.println("Name: "+s.name);
        s.age = 20;
        System.out.println("Age: "+s.age);
        s.roll = 93;
        System.out.println("Roll: "+s.roll);
        s.setMarks(80);
        System.out.println("Marks: "+s.getMarks());
    }
}