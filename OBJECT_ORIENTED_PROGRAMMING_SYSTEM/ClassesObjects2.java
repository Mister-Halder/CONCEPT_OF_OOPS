// Clear concept about classes & objects

public class ClassesObjects2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Debashis");
        System.out.println(s1.name);
        s1.setAge(20);
        System.out.println(s1.age);
        s1.calculatePercentage(80, 90, 100);
        System.out.print(s1.percentage);
    }
}
class Student {
    String name;
    int age;
    float percentage;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math)/3;
    }
}
