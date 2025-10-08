/*
Question 1: Create a class Student

Data Members:

    student_id
    student_name
    marks (for a subject, e.g., Math)

Methods:

    getStudent() - to take inputs
    showGrade() - grade based on marks
    Marks < 50: F
    50-64: D
    65-79: C
    80-89: B
    90-100: A
    showStudent() - display student details
 */

 import java.util.Scanner;

 class Student {
    int student_id;
    String student_name;
    int marks;
    String grade;

    void getStudent() {
        Scanner sc = new Scanner(System.in); //put in the class as a practice

        System.out.println("Enter your name");
        student_name = sc.nextLine();
        System.out.println("Enter your Student ID (4 digits)");
        student_id = sc.nextInt();
        System.out.println("Enter your marks in Math");
        marks = sc.nextInt();
    }
    void showGrade() {
        if (marks >= 90 && marks <= 100) {
            grade = "A";
        }
        else if (marks >= 80 && marks <= 89) {
            grade = "B";
        }
        else if (marks >= 65 && marks <= 79) {
            grade = "C";
        }
        else {
            grade = "D";
        }
    }
    void showStudent() {
        System.out.println("Student: " +student_name+ ", " +student_id+ " has a/an " +grade+ " in math.");
    }
 }

 class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudent();
        s.showGrade();
        s.showStudent();
    }
 }