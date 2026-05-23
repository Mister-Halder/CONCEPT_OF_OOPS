/* Prepare one class with attributes and some methods. Use 3 variables. 
   Prepare the methods and show how to add some copy
   Hints:- 1. Make a constructor
           2. Make a copy constructor */

class Student {
    String name;
    int age;
    int roll;
    String branch;
    Student(String name, int age, int roll, String branch) {  // --> constructor initialize
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.branch = branch;
    }
    Student(Student s) {  // --> copy constructor
        this.name = s.name;
        this.age = s.age;
        this.roll = s.roll;
        this.branch = s.branch;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll);
        System.out.print("Branch: "+branch);
    }
}
public class Question9 {
    public static void main(String args[]) {
        Student s1 = new Student("Debashis Halder", 20, 93, "Computer Science");
        Student s2 = new Student(s1);
        s1.display();
        System.out.println();
        System.out.println();
        s2.display();
    }
    
}
