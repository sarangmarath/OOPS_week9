class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }

    public class Department {
        private String deptName;

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public void displayInfo() {
            System.out.println("Hospital: " + name + ", Department: " + deptName);
        }
    }

    public Department createDepartment(String deptName) {
        return new Department(deptName);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital h = new Hospital("CityCare Hospital");
        Hospital.Department d1 = h.createDepartment("Cardiology");
        Hospital.Department d2 = h.createDepartment("Neurology");

        d1.displayInfo();
        d2.displayInfo();
    }
}
