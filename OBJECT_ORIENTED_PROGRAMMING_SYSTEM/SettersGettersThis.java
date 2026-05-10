public class SettersGettersThis {
    public static void main(String args[]) {
        Company emp1 = new Company();
        emp1.setId(12528);
        System.out.println(emp1.getId());
        emp1.setSalary(80000);
        System.out.println(emp1.getSalary());
        emp1.setId(12530);
        System.out.print(emp1.getId());
    }
}
class Company {
    private int id;
    private float salary;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    float getSalary() {
        return this.salary;
    }
}
