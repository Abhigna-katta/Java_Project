import java.util.ArrayList;
class Student {
    private int rollNumber;
    private String name;
    private Course course;
    private static int studentCount = 0;
    public Student(int rollNumber, String name, Course course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        studentCount++;
    }
    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
        course.displayCourse();
    }
    public static void showTotalStudents() {
        System.out.println("Total students: " + studentCount);
    }
}
 class Course {
    private String courseName;
    private int durationMonths;
    public Course(String courseName, int durationMonths) {
        this.courseName = courseName;
        this.durationMonths = durationMonths;
    }
    public void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + durationMonths + " months");
    }
}
 class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }
    public void showAllStudents() {
        for(Student s : students) {
            s.displayDetails();
            System.out.println("-----------------");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java Full Stack", 6);
        Course pythonCourse = new Course("Python Data Science", 5);
        Student s1 = new Student(101, "Alice", javaCourse);
        Student s2 = new Student(102, "Bob", pythonCourse);
        StudentManagement sm = new StudentManagement();
        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.showAllStudents();
        Student.showTotalStudents();
    }
}