/* Encapsulation :- Encapsulation is defined as the wrapping up of data & methods under a single unit. 
                    It also implements data hiding. */

public class Encapsulation {
    public static void main(String args[]) {
        Teacher t1 = new Teacher();
        t1.setName("Debashis Halder");
        System.out.println(t1.name);
        t1.setAge(20);
        System.out.println(t1.age);
        t1.setSalary(80000);
        System.out.print(t1.getSalary());
    }
}
class Teacher {
    public String name;
    public int age;
    private float salary;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    float getSalary() {
        return this.salary;
    }
}
