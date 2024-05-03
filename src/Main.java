import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Grade grade = new Grade();
    private static Scanner scanner = new Scanner(System.in);

    // Метод для добавления нового студента
    public static void addStudent() {
        System.out.println("Enter student's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter student's last name:");
        String lastName = scanner.nextLine();
        Student student = new Student(firstName, lastName);

        // Добавляем студента и инициализируем его оценки
        grade.addGrade(student);
        System.out.println("Student added successfully!");
    }

    // Метод для внесения оценки для конкретного студента и предмета
    public static void addGrade() {
        System.out.println("Enter student's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter student's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter student's ID:");
        String studentID = scanner.nextLine();
        Student student = new Student(firstName, lastName);

        System.out.println("Enter subject (MATH, PROGRAMMING_LANGUAGES, GERMAN, ENGLISH, ALGORITHMS_AND_DATA_STRUCTURES, SOFTWARE_ENGINEERING):");
        String subjectString = scanner.nextLine();
        Grade.Subject subject = Grade.Subject.valueOf(subjectString);

        System.out.println("Enter grade:");
        double gradeValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        // Добавляем оценку для студента и предмета
        grade.addGrade(student, subject, gradeValue);
        System.out.println("Grade added successfully!");
    }

    // Метод для просмотра рейтинга студента
    public static void viewStudentGrades() {
        System.out.println("Enter student's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter student's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter student's ID:");
        String studentID = scanner.nextLine();
        Student student = new Student(firstName, lastName);
        grade.printStudentGrades(student);
    }

    // Метод для просмотра рейтинга по предмету
    public static void viewSubjectGrades() {
        System.out.println("Enter subject (MATH, PROGRAMMING_LANGUAGES, GERMAN, ENGLISH, ALGORITHMS_AND_DATA_STRUCTURES, SOFTWARE_ENGINEERING):");
        String subjectString = scanner.nextLine();
        Grade.Subject subject = Grade.Subject.valueOf(subjectString);
        grade.printSubjectGrades(subject);
    }


    // Основной метод
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Add grade");
            System.out.println("3. View student grades");
            System.out.println("4. View subject grades");
            System.out.println("5. View all students");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGrade();
                    break;
                case 3:
                    viewStudentGrades();
                    break;
                case 4:
                    viewSubjectGrades();
                    break;
                case 5:
                    grade.printAllStudents();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}