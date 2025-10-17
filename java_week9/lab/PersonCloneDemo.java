class Address implements Cloneable {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[City: " + city + ", Street: " + street + "]";
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy
    public Person deepClone() {
        return new Person(this.name, new Address(this.address.city, this.address.street));
    }

    @Override
    public String toString() {
        return "Person[Name: " + name + ", Address: " + address + "]";
    }
}

public class PersonCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York", "5th Avenue");
        Person p1 = new Person("John", addr);

        // Shallow clone
        Person shallow = (Person) p1.clone();
        // Deep clone
        Person deep = p1.deepClone();

        System.out.println("Before modification:");
        System.out.println("Original: " + p1);
        System.out.println("Shallow: " + shallow);
        System.out.println("Deep: " + deep);

        // Modify original address
        p1.address.city = "Los Angeles";

        System.out.println("\nAfter modification:");
        System.out.println("Original: " + p1);
        System.out.println("Shallow: " + shallow); // shares address
        System.out.println("Deep: " + deep);       // independent address
    }
}
