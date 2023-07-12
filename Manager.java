package JavaSeminar3;

public class Manager extends Employee {
    public Manager(String fullName, String phone, int birthYear, int salary) {
        super(fullName, phone, "Manager", salary, birthYear);
    }

    public static void salaryRise(Employee[] employees, int riseAmount, int ageFrom) {
        for (Employee e : employees) {
            if (e.getAge() >= ageFrom && !(e instanceof Manager)) {
                e.setSalary(e.getSalary() + riseAmount);
            }
        }
    }
}
