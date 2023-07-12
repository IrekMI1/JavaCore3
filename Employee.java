package JavaSeminar3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Employee {
    private final String fullName;
    private String position;
    private int salary;
    private int age;
    private String phoneNumber;
    private final int birthYear;

    public Employee(String fullName, String phoneNumber, String position, int salary, int birthYear) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.birthYear = birthYear;
        age = LocalDateTime.now().getYear() - birthYear;
    }

    public static float averageSalary(Employee[] employees) {
        float salarySum = 0.0f;
        for (Employee e : employees) {
            salarySum += e.getSalary();
        }
        return salarySum / employees.length;
    }

    public static float averageAge(Employee[] employees) {
        float ageSum = 0.0f;
        for (Employee e : employees) {
            ageSum += e.getAge();
        }
        return ageSum / employees.length;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.printf("""
                Информация о сотруднике:
                ФИО:        %s
                Должность:  %s
                Возраст:    %d
                Телефон:    %s
                Зарплата:   %d%n
                """, this.fullName, this.position, this.age, this.phoneNumber, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' + '}';
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Abba Hell", "+78899856514", "trainer", 56000, 1984),
                new Employee("Mia Nagl", "+78989846544", "seller", 36000, 1973),
                new Employee("Nill Kanny", "+77599861274", "cleaner", 26000, 1953),
                new Manager("Bella Boun", "+788998565", 1986, 76000),};

        for (Employee e : employees) {
            e.printInfo();
        }

        Manager.salaryRise(employees, 10000, 45);
        System.out.println("----------------------------");

        for (Employee e : employees) {
            e.printInfo();
        }

        System.out.println("Средняя з/п: " + Employee.averageSalary(employees));
        System.out.println("Средний возраст: " + Employee.averageAge(employees));
    }
}