import java.util.HashSet;

class Employee {
    private String empCode;
    private String name;

    public Employee(String empCode, String name) {
        this.empCode = empCode;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return empCode.equals(other.empCode);
    }

    @Override
    public int hashCode() {
        return empCode.hashCode();
    }

    @Override
    public String toString() {
        return "Employee Code: " + empCode + ", Name: " + name;
    }
}

public class EmployeeAuth {
    public static void main(String[] args) {
        Employee e1 = new Employee("BL001", "Ritika");
        Employee e2 = new Employee("BL001", "Ritika S.");

        System.out.println("== comparison: " + (e1 == e2));
        System.out.println("equals(): " + e1.equals(e2));

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println("HashSet size: " + set.size());
        System.out.println("Employees in set: " + set);
    }
}

