//Constructor :- Constructor is a special method which is invoked automatically at the time of object creation.
// -> Constructors have the same name as class or structure
// -> Constructors don't have a return type (Not even void)
// -> Constructors are only called once, at object creation
// -> Memory allocation happens when constructor is called

public class Constructor1 {
    public static void main(String args[]) {
        Student s1 = new Student();
    }
}
class Student {
    String name;
    int roll;

    Student() {
        System.out.print("Constructor is created.....");
    }
}