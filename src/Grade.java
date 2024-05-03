import java.util.HashMap;
import java.util.Map;

public class Grade {
    public enum Subject {
        MATH, PROGRAMMING_LANGUAGES, GERMAN, ENGLISH, ALGORITHMS_AND_DATA_STRUCTURES, SOFTWARE_ENGINEERING
    }

    private Map<Student, Map<Subject, Double>> grades;

    public Grade() {
        this.grades = new HashMap<>();
    }

    public void addGrade(Student student) {
        grades.put(student, new HashMap<>());
    }

    public void addGrade(Student student, Subject subject, double grade) {
        Map<Subject, Double> studentGrades = grades.getOrDefault(student, new HashMap<>());
        studentGrades.put(subject, grade);
        grades.put(student, studentGrades);
    }
    public Map<Student, Map<Subject, Double>> getGrades() {
        return grades;
    }
    public Double getGrade(Student student, Subject subject) {
        Map<Subject, Double> studentGrades = grades.get(student);
        return studentGrades != null ? studentGrades.get(subject) : null;
    }

    public void printStudentGrades(Student student) {
        System.out.println("Grades for " + student.getFirstName() + " " + student.getLastName() + ":");
        Map<Subject, Double> studentGrades = grades.get(student);
        if (studentGrades != null) {
            for (Map.Entry<Subject, Double> entry : studentGrades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("No grades available for this student.");
        }
    }
    public void printAllStudents() {
        System.out.println("List of all students:");
        for (Student student : grades.keySet()) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() + ", ID: " + student.getStudentID());
        }
    }

    public void printSubjectGrades(Subject subject) {
        System.out.println("Grades for " + subject + ":");
        for (Map.Entry<Student, Map<Subject, Double>> studentEntry : grades.entrySet()) {
            Map<Subject, Double> studentGrades = studentEntry.getValue();
            Double grade = studentGrades.get(subject);
            if (grade != null) {
                System.out.println(studentEntry.getKey().getFirstName() + " " + studentEntry.getKey().getLastName() + ": " + grade);
            }
        }
    }
}
