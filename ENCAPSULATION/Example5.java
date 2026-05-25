// Example of Encapsulation

class Student {
    public String name;
    public int age;
    public int roll;
    private float marks;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setRoll(int roll) {
        this.roll = roll;
    }
    void setMarks(float marks) {
        this.marks = marks;
    }
    float getMarks() {
        return this.marks;
    }
}
public class Example5 {
    public static void main(String args[]) {
        Student s = new Student();
        s.setName("Debashis Halder");
        System.out.println("Name: "+s.name);
        s.setAge(20);
        System.out.println("Age: "+s.age);
        s.setRoll(93);
        System.out.println("Roll: "+s.roll);
        s.setMarks(80);
        System.out.println("Marks: "+s.getMarks());
    }
}
