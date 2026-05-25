// Example of Parameterized Constructor

class Student {
    String name;
    Student(String name) { // --> Parameterized Constructor (Single Parameter)
        this.name = name;
    }
}
public class Example2 {
    public static void main(String args[]) {
        Student s = new Student("Debashis Halder");
        System.out.println("Name: "+s.name);
    }
}
