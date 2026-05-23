// A class named Employee attributes name, salary, date of hiring and calculate the year of service

import java.time.LocalDate;
class Employee {
    String name;
    double salary;
    int hiringYear;
    void addName(String n) {
        name = n;
    }
    void addSalary(double s) {
        salary = s;
    }
    void addHiring(int h) {
        hiringYear = h;
    }
    void yearOfService() {
        int currentYear = LocalDate.now().getYear();
        int service = (currentYear - hiringYear);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Hiring Year: "+hiringYear);
        System.out.print("Year of Service: "+service);
    }
}
public class Question5 {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.addName("Debashis Halder");
        e.addSalary(50000);
        e.addHiring(2024);
        e.yearOfService();
    }
}
