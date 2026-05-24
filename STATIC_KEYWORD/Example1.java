// Example of static properties and static methods or functions using "static" keyword

class Student {
    String name;
    int roll;
    static String schoolName;
    static int calculatePercentage(int phy, int chem, int math) {
        return ((phy+chem+math)/3);
    }
}
public class Example1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.schoolName = "KV";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        s3.schoolName = "MCKV";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        int percentage = s1.calculatePercentage(70, 80, 90);
        System.out.println(percentage);
    }
}