/* A class named Employee attributes name, salary, date of hiring and 
   calculate the year of service using constructor initialization */

import java.time.LocalDate;
class Employee {
    String name;
    double salary;
    int hiringYear;
    Employee(String n, double s, int h) {
        name = n;
        salary = s;
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
public class Question6 {
    public static void main(String args[]) {
        Employee e = new Employee("Debashis Halder", 50000, 2024);
        e.yearOfService();
    }
}
