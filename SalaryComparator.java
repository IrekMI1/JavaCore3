package JavaSeminar3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getSalary() - employee2.getSalary();
    }
}