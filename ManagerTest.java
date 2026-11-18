class ManagerPerson {
    String name;
    int age;
    ManagerPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class ManagerEmployee extends ManagerPerson {
    int empId;
    double basicSalary;
    ManagerEmployee(String name, int age, int id, double salary) {
        super(name, age);
        empId = id;
        basicSalary = salary;
        System.out.println("Employee constructor");
    }
    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class ManagerDetails extends ManagerEmployee {
    String department;
    double bonus;
    ManagerDetails(String name, int age, int id, double salary,
                   String dept, double bonus) {
        super(name, age, id, salary);
        department = dept;
        this.bonus = bonus;
        System.out.println("Manager constructor");
    }
    double totalSalary() {
        return basicSalary + bonus;
    }
    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }
}
class ManagerTest {
    public static void main(String[] args) {
        ManagerDetails m = new ManagerDetails(
                "Rahul", 30, 101, 40000, "IT", 10000
        );
        System.out.println("\nManager Details:");
        m.display();
    }
}