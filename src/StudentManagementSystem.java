import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input student details
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            students[i] = new Student(roll, name, marks);
        }

        // Display average and highest
        double avg = Student.calculateAverage(students);
        int high = Student.findHighest(students);

        System.out.println("\nAverage Marks: " + avg);
        System.out.println("Highest Marks: " + high);

        // Example usage of overloaded methods
        Student.displayStudentInfo(students, 101);
        Student.displayStudentInfo(students, "Alice");
        Student.displayStudentInfo(students, 103, "Mark");
    }
}

