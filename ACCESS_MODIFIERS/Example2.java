// Use some important access modifiers

class Student {
    public String name;
    private float marks;
    public void setMarks(float newMarks) {
        marks = newMarks;
    }
}
public class Example2 {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Debashis Halder";
        System.out.println(s.name);
        s.setMarks(80); // --> Just set the password but not display beacuse it is a private member
    }
}