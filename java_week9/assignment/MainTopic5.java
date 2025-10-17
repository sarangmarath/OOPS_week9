class University {
    String name;

    University(String name) {
        this.name = name;
    }

    // Member inner class
    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDepartment() {
            System.out.println("Department: " + deptName + ", University: " + name);
        }
    }

    // Static nested class
    static class ExamCell {
        static void conductExam() {
            System.out.println("Exam is being conducted.");
        }
    }
}

public class MainTopic5 {
    public static void main(String[] args) {
        University uni = new University("MIT");

        // Member inner class
        University.Department dept = uni.new Department("Computer Science");
        dept.showDepartment();

        // Static nested class
        University.ExamCell.conductExam();
    }
}
