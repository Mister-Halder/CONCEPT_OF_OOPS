// Example of Parameterized Constructor

public class ParameterizedConstructor {
    public static void main(String args[]) {
        Student s1 = new Student("Debashis Halder");
        System.out.print(s1.name);
    }
}
class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name; //This is a Parameterized Constructor
    }
}