/* Write a Java program to create a class called "University" with attributes for students, 
teachers, and branch, and methods to add students, teachers and branch */

class University {
    String student;
    String teacher;
    String branch;
    void addStudent(String s) {
        student = s;
    }
    void addTeacher(String t) {
        teacher = t;
    }
    void addBranch(String b) {
        branch = b;
    }
    void display() {
        System.out.println("Student: "+student);
        System.out.println("Teacher: "+teacher);
        System.out.print("Branch: "+branch);
    }
}
public class Question2 {
    public static void main(String args[]) {
        University u = new University();
        u.addStudent("Debashis Halder");
        u.addTeacher("Sudip Bannerjee");
        u.addBranch("Computer Science");
        u.display();
    }
}
