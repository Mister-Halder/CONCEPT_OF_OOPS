// Example of Encapsulation (Data & Methods without using "this" keyword)

class Student {
    private float marks;
    void setMarks(float myMarks) {
        marks = myMarks;
    }
    float getMarks() {
        return marks;
    }
}
public class Example1 {
    public static void main(String args[]) {
        Student s = new Student();
        s.setMarks(80);
        System.out.println("Marks: "+s.getMarks());
    }
}