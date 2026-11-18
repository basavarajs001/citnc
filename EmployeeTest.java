class Employee {
    int id;
    String name;
    double basicSalary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        basicSalary = salary;
    }
    double calculateSalary() {
        return basicSalary;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
class PermanentEmployee extends Employee {
    double allowance = 5000;
    double bonus = 2000;
    PermanentEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}
class ContractEmployee extends Employee {
    int hours;
    double rate;
    ContractEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    double calculateSalary() {
        return hours * rate;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        e[0] = new PermanentEmployee(101, "Rahul", 20000);
        e[1] = new ContractEmployee(102, "Ravi", 160, 100);
        for (int i = 0; i < 2; i++) {
            e[i].display();
            System.out.println("Salary: " + e[i].calculateSalary());
            System.out.println();
        }
    }
}