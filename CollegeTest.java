class CollegePerson {
    private String name;
    private int age;
    static int count = 0;
    final String COLLEGE = "VTU";
    CollegePerson(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    void displayDetails(String college) {
        System.out.println("College: " + college);
    }
    static class Department {
        void display() {
            System.out.println("Department: Data Science");
        }
    }
}
class CollegeStudent extends CollegePerson {
    private int rollNo;
    CollegeStudent(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNo);
    }
}
class CollegeFaculty extends CollegePerson {
    private String subject;
    CollegeFaculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}
class CollegeAdmin extends CollegePerson {
    private String role;
    CollegeAdmin(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role);
    }
}
class CollegeTest {
    public static void main(String[] args) {
        CollegePerson[] p = new CollegePerson[3];
        p[0] = new CollegeStudent("Rahul", 20, 101);
        p[1] = new CollegeFaculty("Ravi", 40, "Java");
        p[2] = new CollegeAdmin("Kiran", 45, "Manager");
        for (int i = 0; i < 3; i++) {
            p[i].displayDetails();
            System.out.println();
        }
        CollegePerson obj = new CollegePerson("Arun", 30);
        obj.displayDetails("VTU");
        CollegePerson.Department d =
                new CollegePerson.Department();
        d.display();
        System.out.println("Total People: " + CollegePerson.count);
    }
}