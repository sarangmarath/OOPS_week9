class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class MainTopic1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);

        System.out.println(e1); // calls toString()
        System.out.println(e2);

        System.out.println("Class of e1: " + e1.getClass().getName());
        System.out.println("Class of e2: " + e2.getClass().getName());
    }
}
