class University {
    String universityName = "VTU";
    static class Department {
        String deptName;
        Department(String name) {
            deptName = name;
        }
        void display() {
            System.out.println("Department: " + deptName);
        }
    }
    class Faculty {
        String facultyName;
        String designation;
        Faculty(String name, String des) {
            facultyName = name;
            designation = des;
        }
        void display() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }
    void displayUniversity() {
        System.out.println("University: " + universityName);
    }
}
class UniversityTest {
    public static void main(String[] args) {
        University u = new University();
        University.Department d =
                new University.Department("Data Science");
        University.Faculty f =
                u.new Faculty("Rahul", "Professor");
        u.displayUniversity();
        d.display();
        f.display();
    }
}