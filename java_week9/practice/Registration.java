class ContactInfo implements Cloneable {
    String email;
    String phone;

    public ContactInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    @Override
    public String toString() {
        return "[Email: " + email + ", Phone: " + phone + "]";
    }
}

class Student implements Cloneable {
    String id;
    String name;
    ContactInfo contact;

    public Student(String id, String name, ContactInfo contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy
    protected Student deepClone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.contact = (ContactInfo) contact.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "Student: " + id + ", " + name + ", Contact: " + contact;
    }
}

public class Registration {
    public static void main(String[] args) throws CloneNotSupportedException {
        ContactInfo c1 = new ContactInfo("student@mail.com", "9876543210");
        Student s1 = new Student("S101", "Ananya", c1);

        Student shallow = (Student) s1.clone();
        Student deep = s1.deepClone();

        System.out.println("Before modification:");
        System.out.println("Original: " + s1);
        System.out.println("Shallow: " + shallow);
        System.out.println("Deep: " + deep);

        // Modify contact info
        s1.contact.email = "changed@mail.com";

        System.out.println("\nAfter modification:");
        System.out.println("Original: " + s1);
        System.out.println("Shallow: " + shallow);
        System.out.println("Deep: " + deep);
    }
}
