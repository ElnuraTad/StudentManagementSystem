public class Student {

    int rollNumber;
    String name;
    int marks;

    Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Static method to calculate average marks
    public static double calculateAverage(Student[] students) {
        int sum = 0;
        for (Student student : students) {
            sum += student.marks;
        }
        return (double) sum / students.length;
    }

    public static int findHighest(Student[] students) {
        int highest = students[0].marks;
        for (Student student : students) {
            if (student.marks > highest) {
                highest = student.marks;
            }
        }
        return highest;
    }

    // Overloaded methods to display student info

    // By roll number
    public static void displayStudentInfo(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.println("\nStudent Info (By Roll Number " + rollNumber + "):");
                System.out.println("Name: " + student.name);
                System.out.println("Marks: " + student.marks);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // By name
    public static void displayStudentInfo(Student[] students, String name) {
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.println("\nStudent Info (By Name: " + name + "):");
                System.out.println("Roll Number: " + student.rollNumber);
                System.out.println("Marks: " + student.marks);
                return;
            }
        }
        System.out.println("Student with Name " + name + " not found.");
    }

    // By roll number and name
    public static void displayStudentInfo(Student[] students, int rollNumber, String name) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber && student.name.equalsIgnoreCase(name)) {
                System.out.println("\nStudent Info (By Roll Number " + rollNumber + ", Name: " + name + "):");
                System.out.println("Marks: " + student.marks);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " and Name " + name + " not found.");
    }
}


