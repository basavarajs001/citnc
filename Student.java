
import java.util.Scanner;

public class Student {
    String USN, Name, Branch;
    long Phone;

    void getDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.next();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Branch: ");
        Branch = sc.next();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLong();
    }

    void displayDetails() {
        System.out.printf("%-15s %-15s %-15s %-15d%n",
                USN, Name, Branch, Phone);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i].getDetails(sc);
        }

        System.out.println("\n---------- STUDENT DETAILS ----------");
        System.out.printf("%-15s %-15s %-15s %-15s%n",
                "USN", "Name", "Branch", "Phone");

        for (int i = 0; i < n; i++) {
            s[i].displayDetails();
        }

        sc.close();
    }
}
