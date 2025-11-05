/*
Create a class Employee
with data members emp_id, emp_name, designation and salary
methods should be getEmp() - to take inputs
showGrade()- grade of employee depending on salary
showEmp()-show employee details

Salary <10000 -D
10000-24997-C
25000-49999-B
>50000-A

keep class as public, instead of default
keep functions as private
keep variables as private 
 */
import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);

    private int emp_id;
    private String emp_name;
    private String emp_designation;
    private int emp_salary;
    private String grade;

    void getEmp() {
        System.out.println("Enter your Name");
        emp_name = sc.nextLine();
        System.out.println("Enter your designation");
        emp_designation = sc.nextLine();
        System.out.println("Enter your Employee ID (4 Digits)");
        emp_id = sc.nextInt();
        System.out.println("Enter your salary (per year)");
        emp_salary = sc.nextInt();
    }
    void showGrade() {
        if (emp_salary <= 10000) {
            System.out.println("You are grade D");
            grade = "D";
        }
        else if (emp_salary >=10000 && emp_salary<=24999) {
            System.out.println("You are grade C");
            grade = "C";
        }
        else if (emp_salary >=25000 && emp_salary <= 49999) {
            System.out.println("You are grade B");
            grade = "B";
        }
        else {
            System.out.println("You are grade A");
            grade = "A";
        }
    }

    void showEmp() {
        System.out.println("Employee " +emp_id+ ", " +emp_name+ ", is a/an " +emp_designation+ ".");
        System.out.println("They earn $"+emp_salary+", and are grade "+grade);
    }
}

class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getEmp();
        emp.showGrade();
        emp.showEmp();
    }
}