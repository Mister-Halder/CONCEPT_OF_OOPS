// Example of setter & getter function with using "this" keyword

class Student {
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
        s.setMarks(80);
        System.out.print("Marks: "+s.getMarks());
    }
}