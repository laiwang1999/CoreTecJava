import org.omg.CosNaming.NamingContextPackage.NotEmptyHelper;

import java.time.LocalDate;
import java.util.Objects;

public class ManagerTest {
    public static void main(String[] args) {
        Employee e = new Employee("yj", 1.23, 2, 3, 1);
        if (e instanceof Manager) {

        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    /*
    标准比较方法
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        // if(!(o instanceof ClassName)) return false;
        Employee e = (Employee) o;
        return Objects.equals(name, e.name) && salary == e.salary && Objects.equals(hireDay, e.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }
}

class Manager extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
}