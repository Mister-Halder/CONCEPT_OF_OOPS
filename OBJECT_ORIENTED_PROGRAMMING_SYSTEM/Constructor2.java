/* Types of Constructors :- 1. Non-Parameterized Constructor
                            2. Parameterized Constructor
                            3. Copy Constructor */
                            
public class Constructor2 {
    public static void main(String args[]) {
        Student s1 = new Student("Debashis Halder");
        System.out.print(s1.name);
    }
}
class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
}