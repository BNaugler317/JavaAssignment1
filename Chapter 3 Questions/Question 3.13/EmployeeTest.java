// EmployeeTest
// creating and manipulating Employee objects
import java.util.Scanner;

public class EmployeeTest {
  public static void main(String [] args) {
    // create a scanner object to obtain input from the command terminal
    Scanner input = new Scanner(System.in);

    // create an Employee object and assign it to myEmployee
    Employee myEmployee = new Employee("Gloria", "Addams", 5000);

    Employee myEmployee2 = new Employee("John", "Smith", 6000);

    // display annual salary for first employee
    System.out.println("First Name: " + myEmployee.getFirstName()  
    + " Last Name: " + myEmployee.getLastName() + " Monthly Salary: " 
    + myEmployee.getMonthlySalary()); // display employee data first name last name monthly salary
    System.out.println("Press Enter to calculate Annual Salary"); // prompt to calculate annual salary
    input.nextLine();
    System.out.println("Annual Salary: " + myEmployee.getMonthlySalary()*12); // displays annual salary calculation
    System.out.println("Press Enter to calculate Annual 10% raise"); // prompt to calculate 10% raise
    input.nextLine();
    System.out.println("Annual Salary with 10% raise: " + myEmployee.getMonthlySalary()*12*1.10); // displays annual salary with 10% raise

    System.out.println("Press Enter to display next employee..."); // prompt to separate employee 1 from employee 2
    input.nextLine();

    // display annual salary for second employee
    System.out.println("First Name: " + myEmployee2.getFirstName()  
    + " Last Name: " + myEmployee2.getLastName() + " Monthly Salary: " 
    + myEmployee2.getMonthlySalary()); // display employee data first name last name monthly salary
    System.out.println("Press Enter to calculate Annual Salary"); // prompt to calculate annual salary
    input.nextLine();
    System.out.println("Annual Salary: " + myEmployee2.getMonthlySalary()*12); // displays annual salary calculation
    System.out.println("Press Enter to calculate Annual 10% raise"); // prompt to calculate 10% raise
    input.nextLine();
    System.out.println("Annual Salary with 10% raise: " + myEmployee2.getMonthlySalary()*12*1.10); // displays annual salary with 10% raise

    input.close();

  }
}  